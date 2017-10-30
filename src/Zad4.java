import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int suma = 0;
        int liczba=0;

        do{
            System.out.println("Podaj liczbe. 0 konczy wpisywanie liczb.");
            liczba = reader.nextInt();
            suma+=liczba;
        }while(liczba!=0);

        System.out.println(suma);
    }
}
