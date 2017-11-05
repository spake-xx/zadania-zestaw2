import java.util.Random;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj znak wypełnienia:");
        char znak = reader.next().charAt(0);
        System.out.println("Podaj pozycje lewego, gornego boku prostokata X:");
        int x = reader.nextInt();
        System.out.println("Podaj pozycje lewego, gornego boku prostokata Y:");
        int y = reader.nextInt();
        System.out.println("Podaj dlugosc boku A prostokąa:");
        int a = reader.nextInt();
        System.out.println("Podaj wysokosc B prostokata:");
        int b = reader.nextInt();
        for(int i=0; i<(y+b); i++){
            if(i<y){
                System.out.println("");
            }else{
                for(int j=0; j<(x+b); j++){
                    if(j<x){
                        System.out.print(" ");
                    }else{
                        System.out.print(znak);
                    }
                    if(j==(x+b-1)) System.out.print("\n");
                }
            }
        }
    }
}