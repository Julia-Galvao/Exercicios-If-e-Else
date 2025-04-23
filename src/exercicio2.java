import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        double prova1, prova2, mediaprova;
        double trabalho1, trabalho2, trabalho3, mediatrabalho;
        double mediafinal;

        System.out.println("Escreva a nota da prova 1: ");
        prova1 = sc.nextDouble();
        System.out.println("Escreva a nota da prova 2: ");
        prova2 = sc.nextDouble();
        System.out.println("Escreva a nota do trabalho 1: ");
        trabalho1 = sc.nextDouble();
        System.out.println("Escreva a nota do trabalho 2: ");
        trabalho2 = sc.nextDouble();
        System.out.println("Escreva a nota do trabalho 3: ");
        trabalho3 = sc.nextDouble();

        mediaprova = (prova1 + prova2) / 2;
        mediatrabalho = (trabalho1 + trabalho2 + trabalho3 / 3);
        mediafinal = mediaprova * 0.7 + mediatrabalho * 0.3;

        if (mediafinal >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
