import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Wprowadz z jakiej kwoty wydac reszte");
        int zl = reader.nextInt();
        int gr = reader.nextInt();

        int[] nominaly_zl = {5,2,1};
        int[] nominaly_gr = {50,20,10,5,2,1};

        for(int i=0; (i<nominaly_zl.length && zl>0); i++){
            if(zl>=nominaly_zl[i]){
                int ilosc=(int)Math.floor(zl/nominaly_zl[i]);
                System.out.println(nominaly_zl[i]+" zł x"+ilosc);
                zl=zl-(ilosc*nominaly_zl[i]);
            }
        }
        for(int i=0; (i<nominaly_gr.length && gr>0); i++){
            if(gr>=nominaly_gr[i]){
                int ilosc=(int)Math.floor(gr/nominaly_gr[i]);
                System.out.println(nominaly_gr[i]+" gr x"+ilosc);
                gr=gr-(ilosc*nominaly_gr[i]);
            }
        }

    }
}