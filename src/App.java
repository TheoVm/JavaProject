import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Item adaga = new Item("Adaga", 2, 3, 4);
        Item machado = new Item("Machado", 3, 2, 6);
        Item espada = new Item("Espada", 3, 2, 6);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Bem-vindo ao Labirinto ===");
            System.out.print("Digite seu nome de aventureiro: ");
            String nome = scanner.nextLine();
            int escolha = -1;
            Personagem user = null;
            while (escolha < 1 || escolha > 3) {
                System.out.println("Escolha sua classe:");
                System.out.println("1. Tank");
                System.out.println("2. Rogue");
                System.out.println("3. Jorge");
                System.out.print("Digite o numero da classe desejada (1-3): ");

                try {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolha) {
                        case 1:
                            System.out.println("Voce escolheu: Tank!");
                            user = new Tank(nome);
                            break;
                        case 2:
                            System.out.println("Voce escolheu: Rogue!");
                            user = new Rogue(nome);
                            break;
                        case 3:
                            System.out.println("Voce escolheu: Jorge!");
                            user = new Jorge(nome);
                            break;
                        default:
                            System.out.println("Opcao invalida. Tente novamente.\n");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida! Digite apenas numeros de 1 a 3.\n");
                    scanner.nextLine();
                }
            }
            Labirinto labirinto = new Labirinto(3, 3);
            int[] posicao = user.getlocalizacao();
            labirinto.mostrarSalaAtual(posicao[0], posicao[1]);

            

        } finally {
            scanner.close();
        }
    }
}
