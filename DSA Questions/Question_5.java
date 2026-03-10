import java.util.Scanner;

public class Question_5 {
    //   calculate tyres
    public static int totalTyres(int cars, int bikes) {
        return (cars * 4) + (bikes * 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dealerships: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter cars and bikes in dealership " + i + ": ");
            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = totalTyres(cars, bikes);

            System.out.println(tyres);
        }
    }
}

