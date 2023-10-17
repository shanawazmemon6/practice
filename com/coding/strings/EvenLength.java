import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenLength {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String v = sc.nextLine();
    StringTokenizer stringTokenizer = new StringTokenizer(v, " ");
    while (stringTokenizer.hasMoreTokens()) {
      String tokStr = stringTokenizer.nextToken();
      int sizeOfStr = tokStr.length();
      boolean isEven=sizeOfStr % 2 == 0;
      if (isEven) {
        System.out.println(tokStr);
      }
    }
    sc.close();
  }
}
