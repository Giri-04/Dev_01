package Dev.Foundation;

import java.util.Scanner;

public class Switch_Case {

    static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String a =c.next();
        switch (a){
            case "p":
                System.out.println("Present");
                break;
            case "a":
                System.out.println("absent");
                break;
            case "o":
                System.out.println("On-duty");
                break;
            default:
                System.out.println("Goods");
        }


    }
}
