import java.util.*;

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        // Input an elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int majority = 0;
        int maxCount = 0;

        // Check frequency 
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                majority = nums[i];
            }
        }
        System.out.println("Majority Element = " + majority);
    }
}
