package Dev.Foundation;

import java.util.Scanner;

public class While_Loop {
    static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;

        }
        System.out.println("Factorial of " + n + "  is  :" + fact);
    }
}
