import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        //entrada de variaveis
        Scanner sc = new Scanner(System.in);
        double y, x;

        //entrada de dados
        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        //processamento de dados

        if ( x < -5 || x > 5){ //operador lógico OU: ||  -- E: &&

            y= 8/Math.sqrt(x * x -25);;

        //saída de dados
        System.out.println("O resultado da equação é: "+ String.format("%.2f", y));
        }
    }
}
