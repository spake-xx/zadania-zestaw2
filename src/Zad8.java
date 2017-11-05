import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Wprowadz liczbe dla ktorej chcesz wyswietlic dzielniki:");
        int liczba = reader.nextInt();

        for(int i=1; i<=liczba; i++){
            if(liczba%i==0) System.out.println(i);
        }

    }
}