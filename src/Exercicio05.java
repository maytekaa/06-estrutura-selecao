import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        //entrada de variaveis
        Scanner sc = new Scanner(System.in);
        double valorTotal, valorFinal, valorDesconto;

        //entrada de dados

        System.out.print("Informe o valor da compra: ");
        valorTotal = sc.nextDouble();

        //processamento de dados

        if(valorTotal > 1000){
            valorDesconto = valorTotal * 0.15;
            valorFinal = valorTotal - valorDesconto;
        }

        else {
            valorDesconto = valorTotal * 0.08;
            valorFinal = valorTotal - valorDesconto;
        }

        //saida de dados
        System.out.println("O valor final da sua compra é: "+ String.format("%.2f", valorFinal));
        System.out.print("O valor economizado foi: "+ String.format("%.2f", valorDesconto));
    }
}
