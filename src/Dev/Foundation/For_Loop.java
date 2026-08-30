package Dev.Foundation;

import java.util.Scanner;

public class For_Loop {
    static void main(String[] args) {

        System.out.println("Factorial");
        Scanner c = new Scanner(System.in);

       int n=c.nextInt();
      int  fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }

    }
}
