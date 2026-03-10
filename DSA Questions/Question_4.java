import java.util.Scanner;

public class Question_4 {
    //   calculate the equation
    public static int calculate(int a, int b, int c) {

        int result = (a*a*a) + (a*a*b) + (2*a*a*b) + (2*a*b*b) + (a*b*b) + (b*b*b);
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();   // accepted as given in question

        int ans = calculate(a, b, c);
        System.out.println("Result = " + ans);
    }
}
