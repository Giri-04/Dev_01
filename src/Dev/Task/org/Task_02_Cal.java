package Dev.Task.org;

import java.util.Scanner;

public class Task_02_Cal {
    static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = t.nextInt();
        System.out.println("Enter the Second number : ");
        int b = t.nextInt();
        System.out.println("Enter the operation : ");
        char c = t.next().charAt(0);


        switch (c){
            case '+':
                System.out.println("Addition");
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Subraction");
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Multiplication");
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Divition");
                System.out.println(a/b);
                break;
        }

    }
}
