import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isPalindrome(s.toLowerCase()) && usingPredefined(s.toLowerCase())) {
            System.out.println("Give String is Palindrome");
        } else {
            System.out.println("Give String is not a Palindrome");

        }
        sc.close();
    }

    public static boolean usingPredefined(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString().equals(s);
    }

    public static boolean usingRecursive(int c1,int c2, String s){

        if (c2==0){
            return true;
        }

        if(s.charAt(c1)!=s.charAt(c2)){
            return false;
        }        

        return usingRecursive(c1+1, c2-1, s);
    }

    public static boolean isPalindrome(String s)
    {
        return usingRecursive(0, s.length() - 1, s);
    }

}
