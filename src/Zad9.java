import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Wprowadz liczbe, ktora chcesz sprawdzic czy jest liczba pierwsza:");
        int liczba = reader.nextInt();

        boolean pierwsza=true;

        for(int i=2; i<liczba; i++){
            if(liczba%i==0){
                pierwsza=false;
                break;
            }
        }

        if(pierwsza){
            System.out.println("Jest to liczba pierwsza");
        }else{
            System.out.println("Nie jest to liczba pierwsza");
        }

    }
}