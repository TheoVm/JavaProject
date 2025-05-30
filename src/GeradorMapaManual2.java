import java.util.*;

public class GeradorMapaManual2 {
    public static MapaConfigurado criarMapaPadrao(int dificuldade) {
        int altura = 30;
        int largura = 60;
        String[][] mapa = new String[altura][largura];


        mapa[0]  = new String[]{"┌","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐"," "," "," "," "," "," "," ","┌","─","─","─","─","─","┐"," "," "," "," "," ","┌","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐"," "," ","┌","─","─","─","─","─","─","─","─","─","┐"};
        mapa[1]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," ","│",".",".",".",".",".",".",".",".",".","│"};
        mapa[2]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," ","│",".",".",".",".",".",".",".",".",".","│"};
        mapa[3]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","└","─","─","┘",".",".",".",".",".",".",".",".",".","│"};
        mapa[4]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[5]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","┌","─","─","┐",".",".",".",".",".",".",".",".",".","│"};
        mapa[6]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," ","│",".",".",".",".",".",".",".",".",".","│"};
        mapa[7]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," ","│",".",".",".",".",".",".",".",".",".","│"};
        mapa[8]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","└","─","─","─","─","─","─","─","┘",".",".",".",".",".","│"," "," "," "," "," ","└","─","─","─","─","─","─","─","┐",".",".",".","┌","─","─","─","─","┘"," "," ","│",".",".",".","┌","─","─","─","─","─","┘"};
        mapa[9]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[10] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","┌","─","─","─","─","─","─","─","┐",".",".",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[11] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[12] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".","└","─","─","─","─","─","─","─","─","─","─","─","─","─","┘",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[13] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[14] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","└","─","─","─","─","─","─","─","┘",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[15] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","┌","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┘"," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[16] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","┌","─","─","─","─","─","─","─","─","─","─","─","─","─","┘"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[17] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[18] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".","│"," "," "," "," "," "," "};
        mapa[19] = new String[]{"└","─","┐",".",".",".","┌","─","─","─","─","─","─","─","─","┘"," "," ","┌","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐"," "," "," "," "," "," "," ","┌","─","─","─","─","─","─","─","┘",".",".",".","└","─","─","─","─","─","┐"};
        mapa[20] = new String[]{" "," ","│",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[21] = new String[]{" "," ","│",".",".",".","│"," "," "," "," "," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[22] = new String[]{"┌","─","┘",".",".",".","└","─","─","─","─","─","─","┐"," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[23] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[24] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".","└","─","─","─","─","┘",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[25] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[26] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[27] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[28] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".","┌","─","─","─","─","┐",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"," "," "," "," "," "," "," ","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[29] = new String[]{"└","─","─","─","─","─","─","─","─","─","─","─","─","┘"," "," "," "," ","└","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┘"," "," "," "," "," "," "," ","└","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┘"};


        List<Tesouro> tesouros = new ArrayList<>();
        List<int[]> posicoes = new ArrayList<>();
        List<Diario> diarios = new ArrayList<>();
        List<Inimigo> inimigos = new ArrayList<>(Arrays.asList(
            new Inimigo("Draco-Sentinela", 35 + dificuldade, 10 + dificuldade, 10 + dificuldade,  30),
            new Inimigo("Mestre da Corrupcao", 40 + dificuldade, 15 + dificuldade, 20 + dificuldade, 30), 
            new Inimigo("Aberracao de Ossos", 36 + dificuldade, 17 + dificuldade, 30 + dificuldade, 30), 
            new Inimigo("Guardiao do Sangue Vivo", 38 + dificuldade, 8 + dificuldade, 5 + dificuldade, 30)
        ));
        
        Loja loja = new Loja(new int[]{1, 3});

        diarios.add(new Diario("Registro III - Respostas.", "05/10/302", 
                        "\nApós muita pesquisa, finalmente descobri algo revelador:\n" + //
                        "Os Dragonites, ao contrário de nós, humanos, não cultuam a mesma deusa. Eles veneram uma entidade chamada Inter - um deus exterior!\r\n" + //
                        "\n" + //
                        "Segundo suas crenças, eles são fragmentos vivos desse deus, como se cada um carregasse uma parte de sua essência.\n" + //
                        "Curiosamente, sua aversão à luz não vem de uma fraqueza, como eu pensava...\n" + //
                        "Mas sim de um senso distorcido de superioridade. Acreditam que a luz pode deteriorar sua pele dracônica - uma pele que eles consideram perfeita.\n" + //
                        "Que bando de lunáticos!\n", new int[]{20, 38}));
        diarios.add(new Diario("Registro IV - Aquele que governa.", "10/10/302", 
                        "\nEncontrei relatos fragmentados sobre uma figura central entre os Dragonites. \n" + //
                        "Um nome surgia repetidamente, como um sussurro proibido nas paredes das cavernas: Azkaryel.\n" + //
                        "Diferente dos demais, Azkaryel não é apenas um Dragonite comum. Ele é descrito como um colosso — um ser dracônico de proporções descomunais, com escamas negras como carvão e olhos que brilham como brasas acesas no abismo.\n" + //
                        "Os mais antigos o chamam de O Olho de Inter, o elo direto com a divindade que veneram.\n" + //
                        " Aparentemente, é ele quem lidera os rituais nas profundezas e guarda o santuário oculto, onde, dizem, a luz jamais tocou.\n" + //
                        "Estou certo de que descobrir mais sobre Azkaryel é a chave para entender não apenas os Dragonites, mas Inter em si.\n" + //
                        " Ainda assim... algo dentro de mim diz que, ao conhecê-lo, talvez eu deseje nunca ter começado essa jornada.\n", new int[]{20, 59}));


        tesouros.add(new TesouroArmadura(" Anel da Escama Reluzente", new int[]{1, 26}, 2, 70));
        tesouros.add(new TesouroArmadura("Coroa do Fiel Guardião", new int[]{14, 46}, 2, 70));
        tesouros.add(new TesouroArmadura("Orbe da Névoa Crepuscular", new int[]{20, 59}, 2, 70));
        tesouros.add(new TesouroArma("Bracelete do Grito Sombrio", new int[]{20, 38}, 3, 80));
        tesouros.add(new TesouroArma("Adaga de Gelo Profundo", new int[]{28, 1}, 3, 80));
        tesouros.add(new TesouroArma("Punhal da Ira Encarnada", new int[]{1, 64}, 2, 70));



        for (Tesouro t : tesouros) {
            int[] loc = t.getLocalizacao();
            mapa[loc[0]][loc[1]] = "T";
        }
        
        posicoes = posicoesInimigos();

        int[] fim = new int[]{28, 56};
        mapa[fim[0]][fim[1]] = "F"; 
        return new MapaConfigurado(mapa, tesouros, diarios, loja, fim, inimigos, posicoes);
    }

    public static List<int[]> posicoesInimigos(){
        List<int[]> posicoes = new ArrayList<>(Arrays.asList(
        new int[]{20, 37},
        new int[]{21, 38},
        new int[]{9, 44},
        new int[]{9, 45},
        new int[]{9, 46},
        new int[]{9, 18},
        new int[]{4, 53},
        new int[]{15, 20},
        new int[]{20, 3},
        new int[]{20, 4},
        new int[]{20, 5},
        new int[]{18, 56},
        new int[]{18, 57}, 
        new int[]{18, 58}
        ));

        return posicoes;
    }
}
