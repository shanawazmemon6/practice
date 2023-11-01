import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("Is Anagram");
        } else {
            System.out.println("Is Not Anagram");
        }
        sc.close();
    }

    public static boolean isAnagram(String s1, String s2) {

        char cs1[] = s1.toLowerCase().toCharArray();
        char cs2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(cs1);
        Arrays.sort(cs2);

        String ss1 = new String(cs1);
        String ss2 = new String(cs2);

        if (ss1.equals(ss2)) {
            return true;
        } else {
            return false;
        }

    }
}
