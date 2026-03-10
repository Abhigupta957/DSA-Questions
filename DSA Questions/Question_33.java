import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = ' ';
        for(int i = 0; i < str.length(); i++){

            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result = str.charAt(i);
                break;
            }
        }
        if(result != ' ')
            System.out.println("First Non-Repeated Character: " + result);
        else
            System.out.println("No non-repeated character found");
    }
}

