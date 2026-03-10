import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        String result = "";
        // Count hashes and build string without '#'
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#'){
                count++;
            } else {
                result = result + str.charAt(i);
            }
        }
        // Print hashes first
        for(int i = 0; i < count; i++){
            System.out.print("#");
        }
        System.out.println(result);
    }
}
