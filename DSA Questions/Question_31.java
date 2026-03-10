import java.util.Arrays;
import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        // convert strings to char 
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        // sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // compare  arrays
        if(Arrays.equals(a, b)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
