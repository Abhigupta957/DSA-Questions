import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        //  for first number
        for (int a = 1; a <= limit; a++) {
            //  for second number
            for (int b = 1; b <= limit; b++) {
                //  for third number
                for (int c = 1; c <= limit; c++) {
                    // Check Pythagorean condition
                    if ((a * a) + (b * b) == (c * c)) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
