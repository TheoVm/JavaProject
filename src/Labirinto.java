import java.util.InputMismatchException;
import java.util.Scanner;

public class Labirinto {
    private final int linhas;
    private final int colunas;
    private final String[][] arteCelas;

    public Labirinto(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.arteCelas = new String[linhas][colunas];

        inicializarArte();
    }

    private void inicializarArte() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                arteCelas[i][j] = gerarArteSala(i, j);
            }
        }
    }

    private String gerarArteSala(int i, int j) {
        if (i == 0 && j == 0) return gerarArteSala11(i, j);
        if (i == 0 && j == 1) return gerarArteSala12(i, j);
        if (i == 1 && j == 0) return gerarArteSala21(i, j);
        if (i == 1 && j == 1) return gerarArteSala22(i, j);
        return gerarSalaVazia();
    }

    private String gerarArteSala11(int i, int j) {
        return
              "                    \n"
            + "      ______________\n"
            + "      |             \n"
            + "      |  X   _______\n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |     |       ";
    }

    private String gerarArteSala12(int i, int j) {
        return
              "                    \n"
            + "____________________\n"
            + "                    \n"
            + "_______  X   _______\n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |     |       \n";
    }

    private String gerarArteSala21(int i, int j) {
        return
              "      |     |       \n"
            + "      |  X  |       \n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |_____|       ";
    }

    private String gerarArteSala22(int i, int j) {
        return
              "      |     |       \n"
            + "      |     |       \n"
            + "      |     |       \n"
            + "      |     |_______\n"
            + "      |  X          \n"
            + "      |_____________\n";
    }

    private String gerarSalaVazia() {
        return
              "                    \n"
            + "       SEM SALA     \n"
            + "                    \n"
            + "       X ??? X      \n"
            + "                    \n"
            + "       SEM SALA     \n"
            + "                    \n";
    }

    public void mostrarSalaAtual(int jogadorX, int jogadorY) {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        try {
            if (jogadorX >= 0 && jogadorX < linhas && jogadorY >= 0 && jogadorY < colunas) {
                System.out.println(arteCelas[jogadorX][jogadorY]);
                System.out.println("O que deseja fazer a seguir?");
                System.out.println("1. Ir a Direita");
                System.out.println("2. Ir para baixo");
                System.out.println("3. Olhar status");
                System.out.println("4. Olhar tesouros");
                System.out.print("Digite a opção desejada (1-4): ");
                escolha = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Você está fora dos limites do labirinto!");
            }
            switch (escolha) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.\n");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida! Digite apenas numeros de 1 a 4.\n");
            scanner.nextLine();
        }
    }
}
