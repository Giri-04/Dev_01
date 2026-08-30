package Dev.Foundation;

public class Array_2D {
    static void main(String[] args) {
        int[][]matrix=new int[10][5];
        matrix[0][0]=1;
        matrix[1][1]=1;
        matrix[2][2]=1;
        matrix[3][3]=1;
        matrix[4][4]=1;
        matrix[5][3]=1;
        matrix[6][2]=1;
        for (int i=0; i<10;i++){
            for (int j=0;j<5;j++)
                System.out.print(matrix[i][j]);
            System.out.println("");
        }

    }
}
