import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, aux;

        System.out.println("Escreva o valor de A: ");
        a = sc.nextInt();
        System.out.println("Escreva o valor de B: ");
        b = sc.nextInt();
        System.out.println("Escreva o valor de C: ");
        c = sc.nextInt();

        if (a>b){
            aux = a;
            a = b;
            b = aux;

        }
        if (a>c){
            aux = a;
            a = c;
            c = aux;
        }
        if (b>c){
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println(a + " " + b + " " + c);
    }
}