import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(99)+1;
        int enteredNumber;
        System.out.println("System wylosował jedną liczbę z przedziału 1-100. Odgadnij ją!");

        do{
            enteredNumber = reader.nextInt();
            if(enteredNumber<number) System.out.println("Liczba jest za mala!");
            if(enteredNumber>number) System.out.println("Liczba jest za duza!");
        }while(enteredNumber!=number);

        System.out.println("Gratulacje!");
    }
}