import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Reverse {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();

        StringTokenizer stringTokenizer=new StringTokenizer(s," "); 
        ArrayList<String> arrayList=new ArrayList<String>(); 
        while(stringTokenizer.hasMoreTokens())
        { 
             arrayList.add(stringTokenizer.nextToken());
        } 
        StringJoiner stringJoiner=new StringJoiner(" ");
         for(int i=arrayList.size()-1;i>=0;i--){ 
          stringJoiner.add(arrayList.get(i));
         }
         System.out.println(stringJoiner.toString());
         sc.close();
    }
    
}
