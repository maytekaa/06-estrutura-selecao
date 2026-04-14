import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        //entrada de dados
        double lado1, lado2, lado3, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do lado 1: ");
        lado1 = sc.nextDouble();

        System.out.print("Informe o valor do lado 2: ");
        lado2 = sc.nextDouble();

        System.out.print("Informe o valor do lado 3: ");
        lado3 = sc.nextDouble();

        //processamento de dados

        if(lado2 + lado3 < lado1 && lado1 + lado3 < lado2 && lado1 + lado2 < lado3){

            System.out.print("Não é um triângulo.");
        }

        else {
            System.out.println("É um triângulo. ");
        }
    }
}
