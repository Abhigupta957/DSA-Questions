import java.util.Scanner;

public class Question_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){

            String temp = "";
            for(int j = i; j < s.length(); j++){

                char c = s.charAt(j);
                if(temp.indexOf(c) != -1){
                    break;
                }
                temp = temp + c;
                if(temp.length() > maxLength){
                    maxLength = temp.length();
                }
            }
        }
        System.out.println("Longest Length: " + maxLength);
    }
}
