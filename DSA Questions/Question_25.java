import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First array size
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];

        // Input first array
        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++){
            nums1[i] = sc.nextInt();
        }
        // Second array size
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];

        // Input second array
        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("Intersection elements:");

        // Check intersection
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1[i] == nums2[j]){
                    // Check if already printed (to keep unique)
                    boolean alreadyPrinted = false;

                    for(int k = 0; k < i; k++){
                        if(nums1[k] == nums1[i]){
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if(!alreadyPrinted){
                        System.out.print(nums1[i] + " ");
                    }
                    break;
                }
            }
        }
    }
}
