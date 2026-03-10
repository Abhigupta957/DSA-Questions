import java.util.Scanner;

public class Question_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev = "";
        // Reverse the string
        for(int i = s.length() - 1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        // Check palindrome
        if(s.equals(rev)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
