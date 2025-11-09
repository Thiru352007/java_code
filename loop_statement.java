//check enter number is perfect or not
import java.util.*;

class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, a = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (i = 1; i <= n ; i++) {
            if (n % i == 0)
                a = a + i;
        }

        if (n == a)
            System.out.println("Entered number is perfect");
        else
            System.out.println("Entered number is not perfect");

        sc.close();
    }
}
