import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        //entrada de dados
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.print("Informe o ano: ");
        ano = sc.nextInt();

        //processamento de dados

        if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){

            System.out.print( ano+ " é bissexto. ");
        }

        else {
            System.out.print("Não é um ano bissexto. ");
        }
    }
}
