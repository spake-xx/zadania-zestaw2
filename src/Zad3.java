import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe a:");
        int a = reader.nextInt();

        int i=0;
        while(Math.pow(2, i)<=a){
            System.out.println(i+": "+Math.pow(2, i));
            i++;
        }
    }
}
