import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int idade;

        System.out.println("Informe a idade: ");
        idade = input.nextInt();
        
        if (idade < 18) {
            System.out.println("ACESSO PROIBIDO");
        }
        else {
            System.out.println("ACESSO LIBERADO");
        }
    }
}
