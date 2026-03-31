import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        //entrada de variaveis
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;

        //entrada de dados
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        //processamento de dados
        media = (nota1 + nota2 )/2;

        //saida de dados
        System.out.println("A sua média é: "+ media);

        if(media >= 6){
            System.out.print("Aprovado!!");
        }

        else {

            System.out.println("Reprovado!!");
        }

    }
}
