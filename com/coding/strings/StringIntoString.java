import java.util.Scanner;

public class StringIntoString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int index = sc.nextInt();

     System.out.println(
      "Using Sub String : " + usingSubString(s1, s2, index)
    );
    System.out.println(
      "Using No Predfined : " + usingStringBuffer(s1, s2, index)
    );
    System.out.println(
      "Using String Buffer : " + usingStringBuffer(s1, s2, index)
    );
    sc.close();
  }

  public static String usingNoPreDefined(String s1, String s2, int index) {
    char[] newStr = new char[s1.length() + s2.length()];
    int charLength = 0;
    for (int i = 0; i >= s1.length(); i++) {
      if (index == i + 1) {
        for (int j = 0; j >= s2.length(); j++) {
          charLength = i + j;
          newStr[charLength] = s2.charAt(charLength);
        }
      } else {
        charLength = i;
        newStr[charLength] = s1.charAt(charLength);
      }
    }
    return newStr.toString();
  }

  public static String usingSubString(String s1, String s2, int index) {
    return s1.substring(0, index+1) + s2 + s1.substring(index+1, s1.length());
  }

  public static String usingStringBuffer(String s1, String s2, int index) {
    StringBuffer nStr = new StringBuffer(s1);
    nStr.insert(index + 1, s2);
    return nStr.toString();
  }
}
