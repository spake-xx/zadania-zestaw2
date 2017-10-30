import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        for(int i=1; i<=x; i=i+2){
            System.out.print(i+"");
        }
    }
}
