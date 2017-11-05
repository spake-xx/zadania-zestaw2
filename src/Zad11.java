import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wprowadz wysokosc choinki:");
        int h = reader.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}