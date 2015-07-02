import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrix_size = in.nextInt();
        int[][] matrix = new int[matrix_size][matrix_size];
        for (int i=0;i<matrix_size;i++) {
            for (int j=0;j<matrix_size;j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int sum_1=0, sum_2=0;
        for (int i=0,j=matrix_size-1 ; i<matrix_size ; ) {
            sum_1 +=matrix[i][i];
            sum_2 +=matrix[j][i];
            i++;
            j--;
        }
        System.out.println(Math.abs(sum_1-sum_2));
    }
}