import java.util.Scanner;

public class Question_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter strings:");
        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }
        String prefix = strs[0];

        for(int i = 1; i < n; i++){

            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    System.out.println("");
                    return;
                }
            }
        }
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
