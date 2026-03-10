import java.util.Arrays;
import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        // sort the array
        Arrays.sort(nums);

        int kthLargest = nums[n - k];
        System.out.println("Kth Largest Element: " + kthLargest);
    }
}

