//code to print all no divisible by given number
import java.util.*;
public class for_loop3 {
    public static void main (String[] gars){
        Scanner sc = new Scanner (System.in);
        int i,n,x,y;
           System.out.println("enter the range (n)");
        n=sc.nextInt();
        System.out.println("Enter divisible number 1 as x:" );
        x=sc.nextInt();
        System.out.println("enter divisible number 2 as y:");
        y=sc.nextInt();
         System.out.println("number divisible by both" +x+ "and" +y+ "from 1 to" + n + "are");
        for(i=1;i<=n;i++){
            if(i%x==0 && i%y==0)
            System.out.println(i);
           
        }
    }
    
}
