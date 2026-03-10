import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int total = n * (n + 1) / 2;   // sum of numbers from 0 to n
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        int missing = total - sum;
        System.out.println("Missing Number: " + missing);
    }
}

