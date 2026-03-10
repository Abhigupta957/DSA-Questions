import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      // number of steps
        String path = sc.next();   // path of U and D

        int level = 0;
        int valleys = 0;

        for(int i = 0; i < n; i++){
            char step = path.charAt(i);
            if(step == 'U'){
                level++;

                if(level == 0){
                    valleys++;
                }
            } else if(step == 'D'){
                level--;
            }
        }
        System.out.println(valleys);
    }
}
