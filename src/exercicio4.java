import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.println("x --> ");
        x = sc.nextDouble();

        //teste para x válido
        if(x > 5 || x < -5) {
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println("y = " + y);
        }
        else {
            System.out.println("Valor inválido de X");
        }

        //teste para x inválido
        if(x >= -5 && x <= 5) {
            System.out.println("Valor inválido de x");
        }
        else {
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println("y = " + y);
        }
    }
}
