import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int index = -1;

        for(int i = 0; i < s.length(); i++){
            int count = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}

