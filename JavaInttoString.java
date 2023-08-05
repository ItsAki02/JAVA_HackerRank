import java.util.*;

public class JavaInttoString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = Integer.toString(n);

            if(n == Integer.parseInt(s)){
                System.out.println("Good job");
            }
            else{
                System.out.println("Wrong answer");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;    }
}
