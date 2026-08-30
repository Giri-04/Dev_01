package Dev.Foundation;

public class Jumping_Statement {
    static void main(String[] args) {
        System.out.println("Break");
        for (int i =1; i<10;i++){
            for (int j=0; j<20;j++){
                if (j==10){
                    continue;
                }
                System.out.print(j);
            }
            if (i==4){
                break;
            }
            System.out.print(i);
        }
    }
}
