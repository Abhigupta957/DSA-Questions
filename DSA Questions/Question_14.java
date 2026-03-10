import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 4;
        int cols = 4;
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        boolean identical = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (A[i][j] != B[i][j]) {
                    identical = false;
                    break;
                }
            }
        }
        if (identical)
            System.out.println("Matrices are identical");
        else
            System.out.println("Matrices are not identical");
    }
}
