import java.util.Scanner;

import org.xml.sax.SAXException;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();
        sc.close();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média desse aulo foi de " + media);
    }
}
