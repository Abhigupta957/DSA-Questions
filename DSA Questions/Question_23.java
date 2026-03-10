import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter a size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        // Input an elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int index = 0; // position  next non-zero element 

        // Move all non-zero elements to the front
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        //  remaining positions with zero
        while(index < n){
            nums[index] = 0;
            index++;
        }
        //  final array
        System.out.println("Array after moving zeros to end:");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
