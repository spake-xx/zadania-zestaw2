import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int suma = 0;
        int min, max;
        int i=0;

        int liczba = 0;
        do{
            System.out.println("Podaj liczbe. 0 konczy wpisywanie liczb.");
            liczba = reader.nextInt();
            suma+=liczba;
            if(i==0){
                min=liczba;
                max=liczba;
            }else{
                if(liczba>max) max=liczba;
                if(liczba<min) min=liczba;
            }
            i++;
        }while(liczba!=0);

        System.out.println("Suma liczb:"+suma);
        System.out.println("Najmniejsza liczba:"+min);
        System.out.println("Najwieksza liczba:"+max);
        System.out.println("Srednia liczb:"+suma/i);



    }
}
