import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double x=0, y;

        System.out.println("valor de x: ");
        x = sc.nextDouble();


        if (x>5 && x<10) {
            System.out.println("Valor válido");
        }
        else {
            System.out.println("Valor invalido");
        }
    }
}
