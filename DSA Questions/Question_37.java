import java.util.Scanner;

public class Question_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();

        if(s.length() == goal.length() && (s + s).contains(goal)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
