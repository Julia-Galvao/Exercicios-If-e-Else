import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totaldecompras, valorpagar, desconto;

        System.out.print("Escreva o valor do seu total de compras: ");
        totaldecompras = sc.nextDouble();

        if (totaldecompras > 1000 ){
            valorpagar = totaldecompras * 85 / 100;
        }
        else {
            valorpagar = totaldecompras * 92 / 100;
        }
        desconto = totaldecompras - valorpagar;
        System.out.println("Valor a pagar R$: " + valorpagar);
        System.out.println("Desconto R$: " + desconto);
    }


}
