import java.util.*;

public class GeradorMapaManual3 {
    public static MapaConfigurado criarMapaPadrao(int dificuldade) {
        int altura = 30;
        int largura = 60;
        String[][] mapa = new String[altura][largura];  

        mapa[0]  = new String[]{"┌","─","─","─","─","─","─","─","─","─","─","─","─","┬","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐"};
        mapa[1]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[2]  = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[3]  = new String[]{"├","─","─","┬","─","─","─","─","─",".",".",".",".","├","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐",".",".","│"};
        mapa[4]  = new String[]{"│",".",".","│",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│"};
        mapa[5]  = new String[]{"│",".",".","│",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│"};
        mapa[6]  = new String[]{"│",".",".","│",".",".","┌","─","─","─","─","─","─","┴","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─",".",".",".",".",".","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐",".",".","│",".",".","│"};
        mapa[7]  = new String[]{"│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[8]  = new String[]{"│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".","│"};
        mapa[9]  = new String[]{"│",".",".","│",".",".","│",".",".","┌","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┐",".",".","│",".",".",".",".",".","│"};
        mapa[10] = new String[]{"│",".",".","│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".",".",".",".","│"};
        mapa[11] = new String[]{"│",".",".","│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".",".",".",".","│"};
        mapa[12] = new String[]{"│",".",".",".",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[13] = new String[]{"│",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[14] = new String[]{"│",".",".","─","─","─","┤",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[15] = new String[]{"│",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[16] = new String[]{"│",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│",".",".","│"};
        mapa[17] = new String[]{"│",".",".","│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│",".",".","│"};
        mapa[18] = new String[]{"│",".",".","│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│",".",".","│"};
        mapa[19] = new String[]{"│",".",".","│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│",".",".","│"};
        mapa[20] = new String[]{"│",".",".","│",".",".","│",".",".","└","─","─","─","─","─","─","┬","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┘",".",".","│",".",".","│",".",".","│"};
        mapa[21] = new String[]{"│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[22] = new String[]{"│",".",".","│",".",".","│",".",".",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[23] = new String[]{"│",".",".","│",".",".","└","─","─","─","─","┐",".",".",".",".","└","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┤",".",".","├","─","─","┤"};
        mapa[24] = new String[]{"│",".",".","│",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[25] = new String[]{"│",".",".","│",".",".",".",".",".",".",".","│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│",".",".","│",".",".","│"};
        mapa[26] = new String[]{"│",".",".","└","─","─","─","─","─","─","─","┴","─","─","─","─","─","─","─","─","─","─","─","─",".",".",".",".","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┴","─","─","┘",".",".","│"};
        mapa[27] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[28] = new String[]{"│",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","│"};
        mapa[29] = new String[]{"└","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","─","┘"};


        List<Tesouro> tesouros = new ArrayList<>();
        List<int[]> posicoes = new ArrayList<>();
        List<Diario> diarios = new ArrayList<>();
        List<Inimigo> inimigos = new ArrayList<>(Arrays.asList(
            new Inimigo("Mosca da Pele Fria", 39 + dificuldade, 9 + dificuldade, 10 + dificuldade,  40),
            new Inimigo("Arauto da Carne Eterna", 48 + dificuldade, 4 + dificuldade, 15 + dificuldade, 40), 
            new Inimigo("Servo Gemente", 43 + dificuldade, 8 + dificuldade, 6 + dificuldade, 40), 
            new Inimigo("Dragão Abissal", 45 + dificuldade, 6 + dificuldade, 10 + dificuldade, 40)
        ));
        
        Loja loja = new Loja(new int[]{19, 30});

        diarios.add(new Diario("Registro V - Um plano maléfico", "03/11/302",
                        "Tenho um pressentimento… e não é bom.\n" + //
                        "A cada dia que passa, Azkaryel parece crescer em poder — não apenas em presença, mas em estratégia.\r\n" + //
                        "\n" + //
                        "Seus exércitos se multiplicam nas sombras. Vejo novos soldados dracônicos surgindo constantemente, forjados nas câmaras mais profundas das cavernas, onde a luz jamais ousa entrar.\n" + //
                        "Eles treinam em silêncio, em fileiras perfeitas, com uma disciplina assustadora. Cada movimento deles ecoa pelas paredes como se fossem uma extensão da vontade de Azkaryel.\n" + //
                        "\n" + //
                        "Isso não é apenas defesa.\n" + //
                        "É preparação.\n" + //
                        "Para quê, ainda não sei. Mas temo que logo... todos nós saberemos.", new int[]{25, 10}));

        diarios.add(new Diario("Registro VI - Sem escapatória", "06/11/302", 
                        "Eu fui descuidado. Por um instante, apenas um — me aproximei demais do salão onde os guerreiros dracônicos treinavam. Achei que a escuridão me esconderia… mas eles me viram.\n" + //
                        "\n" + //
                        "Não sei como. Talvez tenham sentido meu cheiro. Ou talvez Inter os tenha alertado. Seja como for, não há mais como negar: estou sendo caçado.\n" + //
                        "\n" + //
                        "Ouvi os gritos. O som de garras rasgando pedra. O chão inteiro pareceu tremer.\n" + //
                        "Consegui escapar por uma fenda estreita entre as rochas — apenas por sorte. Mas agora estou preso aqui, entre raízes úmidas e pedras afiadas.\n" + //
                        "\n" + //
                        "Minhas mãos tremem enquanto escrevo. Cada som ecoa como um trovão.\n" + //
                        "Se este for meu último registro… saiba, caro leitor, que eles estão vindo.\n" + //
                        "E Azkaryel... ele sabe da minha existência.\n" + //
                        "Talvez sempre soube.\"", new int[]{22, 64}));


        tesouros.add(new TesouroArmadura("Manto das Sombras Eternas", new int[]{4, 1}, 4, 80));
        tesouros.add(new TesouroArmadura("Elmo da Fúria Ancestral", new int[]{25, 10}, 4, 80));
        tesouros.add(new TesouroArma("Espada do Eclipse Sangrento", new int[]{21, 31}, 4, 80));
        tesouros.add(new TesouroArma("Anel da Vontade Indômita", new int[]{22, 64}, 4, 80));

        for (Tesouro t : tesouros) {
            int[] loc = t.getLocalizacao();
            mapa[loc[0]][loc[1]] = "T";
        }
        
        
        tesouros.add(new TesouroArma("Excalibur", new int[]{15, 29}, 0, 0));
        
        posicoes = posicoesInimigos();

        int[] fim = new int[]{1, 31};
        mapa[fim[0]][fim[1]] = "F"; 
        return new MapaConfigurado(mapa, tesouros, diarios, loja, fim, inimigos, posicoes);


    }

    public static List<int[]> posicoesInimigos(){
        List<int[]> posicoes = new ArrayList<>(Arrays.asList(
        new int[]{10, 1},
        new int[]{10, 2},
        new int[]{17, 4},
        new int[]{17, 5},
        new int[]{20, 57},
        new int[]{20, 58},
        new int[]{15, 63},
        new int[]{15, 64},
        
        new int[]{0, 0}
        ));

        return posicoes;
    }
}
