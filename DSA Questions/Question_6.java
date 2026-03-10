import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();   // for buffer

        String minItem = "";
        int minDiscount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine(); 
            String[] data = input.split(",");

            String name = data[0];
            int price = Integer.parseInt(data[1]);
            int discountPercent = Integer.parseInt(data[2]);
            int discountAmount = (price * discountPercent) / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                minItem = name;
            }
        }
        System.out.println(minItem);
    }
}
