import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input  elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //  target value
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int count = 0;

        // Check  possible pairs
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){

                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        //  result
        System.out.println("Number of pairs = " + count);
    }
}
