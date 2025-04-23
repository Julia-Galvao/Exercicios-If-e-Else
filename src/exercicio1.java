public class exercicio1 {
    public static void main(String[] args) {

        double nota1 = 8;
        double nota2 = 7;
        double media = (nota1+nota2) / 2;
        System.out.println("média = "+ media);

        /*operadores
        1) atribuição --> =
        2)aritméticos --> +, -, *, /, %,
        3) relacionais --> <, >, >=, <=, ==, !=
        4) Lógicos/Booleanos --> E (&&), OU (||), NÃO (!)
         */

        if(media >= 6) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
