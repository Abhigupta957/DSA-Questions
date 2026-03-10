import java.util.Arrays;
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }
        Arrays.sort(arr);
        int secondSmallest = -1;
        int secondLargest = -1;

        // find second smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }
        // find second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
    }
}
