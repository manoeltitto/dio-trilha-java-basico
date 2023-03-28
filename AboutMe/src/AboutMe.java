
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura= scanner.nextDouble();


        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(altura);

    }


}
