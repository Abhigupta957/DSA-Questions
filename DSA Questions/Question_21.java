import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input  elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Initialize variables
        int maxProduct = nums[0];   // Final maximum product
        int currentMax = nums[0];   // Current maximum product till index
        int currentMin = nums[0];   // Current minimum product till index

        // Traverse  array
        for(int i = 1; i < n; i++) {
            int num = nums[i];

            // If number is negative, then  swap currentMax and currentMin
            if(num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            // Update current max and min
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update final maximum product
            maxProduct = Math.max(maxProduct, currentMax);
        }
        // Output
        System.out.println("Maximum Product Subarray = " + maxProduct);
    }
}
