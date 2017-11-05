import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Wprowadz liczbe calkowita do obliczenia sumy jej cyfr:");
        int liczba = reader.nextInt();
        int suma_parzystych = 0;
        int liczba_parzystych = 0;
        int suma_nieparzystych = 0;
        int liczba_nieparzystych = 0;

        while(liczba>0){
            int cyfra = liczba%10;
            liczba/=10;
            if(cyfra%2==0){
                suma_parzystych+=cyfra;
                liczba_parzystych++;
            }else{
                suma_nieparzystych+=cyfra;
                liczba_nieparzystych++;
            }
        }

        if(liczba_parzystych==0) liczba_parzystych=1;
        if(liczba_nieparzystych==0) liczba_nieparzystych=1;

        float srednia_parzystych = (suma_parzystych/liczba_parzystych);
        float srednia_nieparzystych = (suma_nieparzystych/liczba_nieparzystych);

        System.out.println("Suma cyfr tej liczby: "+(suma_parzystych+suma_nieparzystych));
        System.out.println("Srednia arytmetyczna cyfr parzystych "+srednia_parzystych);
        System.out.println("Srednia arytmetyczna cyfr nieparzystych "+srednia_nieparzystych);
        System.out.println("Stosunek sredniej arytmetycznej cyfr parzystych do sredniej arytm. cyfr nieparzystych:  "+(srednia_parzystych/srednia_nieparzystych));




    }
}