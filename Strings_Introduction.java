
import java.util.*;

public class Strings_Introduction  {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            System.out.println(A.length()+B.length());
            if(A.compareTo(B)>0)
             System.out.println("Yes");
             else
             System.out.println("No");
             
            String s1 = A.substring(0,1).toUpperCase()+A.substring(1);
            String s2 = B.substring(0,1).toUpperCase()+B.substring(1);
            
            System.out.println(s1 + " " + s2);
        } 
        
    }
}



