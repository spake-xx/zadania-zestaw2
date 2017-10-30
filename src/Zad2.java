import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        int a = reader.nextInt();
        int b;
        /*
         * Wczytywanie liczby b
         */
        do{
            System.out.println("Podaj liczbe b wieksza od a:");
            b = reader.nextInt();
        }while(b<=a);

        /*
           Petla numer 1
         */
        int suma=0;
        int i=a;
        do{
            suma+=i;
            i++;
        }while(i<=b);
        System.out.println(suma);

        /*
            Petla numer 2
         */
        suma=0;
        i=a;
        while(i<=b){
            suma+=i;
            i++;
        }
        System.out.println(suma);

        /*
            Petla numer 3
         */
        suma=0;
        for(int j=a; j<=b; j++){
            suma+=j;
        }
        System.out.println(suma);
    }
}
