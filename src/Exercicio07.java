import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        //entrada de dados
        Scanner sc = new Scanner(System.in);
        int graus;

        System.out.print("Graus ---> ");
        graus = sc.nextInt();

        //processamento de dados

        if(graus > 20){

            System.out.print("Temperatura quente. ");
        }

        else {
            System.out.print("Temperatura fria. ");
        }

    }
}
