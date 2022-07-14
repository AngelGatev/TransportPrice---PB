package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double sum = 0.00;
        if (distance < 20) {
            if (dayOrNight.equals("day")) {
                sum = 0.70 + 0.79 * distance;
                System.out.printf("%.02f", sum);
            } else {
                sum = 0.70 + 0.90 * distance;
                System.out.printf("%.02f", sum);
            }
        } else if (distance < 100) {
            sum = distance * 0.09;
            System.out.printf("%.02f", sum);
        } else {
            sum = distance * 0.06;
            System.out.printf("%.02f", sum);
        }
    }
}
