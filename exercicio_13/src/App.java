import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
        double altura;
        char sexo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira sua altura: ");
        altura = teclado.nextDouble();

        System.out.print("Insira seu sexo (H ou M): ");
        sexo = teclado.next().charAt(0);
        teclado.close();

        System.out.println("");

        if (sexo == 'H') {
            System.out.println("O peso ideal para um homem de " + altura + " é de: " + ((72.7 * altura) - 58));
        } else {
            System.out.println("O peso ideal para uma mulher de " + altura + " é de: " + ((62.1 * altura) - 44.7));
        }

    }
}