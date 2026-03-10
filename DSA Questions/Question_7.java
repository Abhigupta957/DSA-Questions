import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //  if number is zero
        if (num == 0) {
            System.out.println("No Factors");
            return;
        }
        // if  number is negative
        if (num < 0) {
            num = -num;
        }
        // Find and print factors
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                if (i == num) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
