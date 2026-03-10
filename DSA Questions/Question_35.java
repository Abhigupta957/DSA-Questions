import java.util.Scanner;

public class Question_35 {
    //  check palindrome
    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String longest = "";

        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){

                String sub = s.substring(i, j);

                if(isPalindrome(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        System.out.println("Longest Palindromic Substring: " + longest);
    }
}
