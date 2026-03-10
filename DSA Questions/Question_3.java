import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int sem = sc.nextInt();

        int[] subjects = new int[sem];

        //  subjects for each semester
        for (int i = 0; i < sem; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjects[i] = sc.nextInt();
        }
        int[] maxMarks = new int[sem];
        //  marks and find max
        for (int i = 0; i < sem; i++) {

            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            int max = -1;
            for (int j = 0; j < subjects[i]; j++) {

                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
                if (mark > max) {
                    max = mark;
                }
            }
            maxMarks[i] = max;
        }
        System.out.println("\nOutput\n");
        //  maximum marks
        for (int i = 0; i < sem; i++) {
            System.out.println("Maximum mark in " + (i + 1) + " semester: " + maxMarks[i]);
        }
    }
}
