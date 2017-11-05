import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min, max;
        int suma;
        System.out.println("Podaj liczbe. 0 konczy wpisywanie liczb.");
        int val = reader.nextInt();
        min = max = suma = val;
        int i=1;

        while(val!=0){
            System.out.println("Podaj liczbe. 0 konczy wpisywanie liczb.");
            val = reader.nextInt();
            if(val==0) break;
            if(val<min) min=val;
            if(val>max) max=val;
            suma+=val;
            i++;
        };

        System.out.println("Suma liczb:"+suma);
        System.out.println("Najmniejsza liczba:"+min);
        System.out.println("Najwieksza liczba:"+max);
        System.out.println("Srednia liczb:"+suma/i);
    }
}
