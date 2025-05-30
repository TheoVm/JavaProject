import java.io.*;
import java.util.*;

public class Labirinto implements Serializable{
    private int dificuldade;
    private final String[][] mapa;
    private final List<Tesouro> tesouros;
    private final List<Diario> diarios;
    private final Loja loja;
    private MapaConfigurado config;
    private final Aventureiro jogador;
    private boolean salaSecretaDesbloqueada;
    private List<Inimigo> inimigos;
    private List<Inimigo> inimigosGerados;
    private List<int[]> posicoesInimigos;
    private int[] fim;
    private Boolean trocar;
    private int tipo;

    public Labirinto(Aventureiro jogador, int dificuldade, int tipo) {
        this.jogador = jogador;
        this.dificuldade = dificuldade;
        this.trocar = false;
        this.tipo = tipo;
        while(true){
            switch (tipo) {
                case 1:
                    this.config = GeradorMapaManual1.criarMapaPadrao(dificuldade);
                    break;
                case 2:
                    this.config = GeradorMapaManual2.criarMapaPadrao(dificuldade);
                    break;
                case 3:
                    this.config = GeradorMapaManual3.criarMapaPadrao(dificuldade);
                    break;
                case 4:
                    this.config = Boss.criarMapaPadrao(dificuldade);
                    break;
                default:
                    break;
            }
            break;
        }
        this.mapa = config.getMapa();
        this.tesouros = config.getTesouros();
        this.diarios = config.getDiarios();
        this.loja = config.getLoja();
        this.fim = config.getFim();
        this.salaSecretaDesbloqueada = false;
        this.inimigos = config.getInimigosPossiveis();
        this.inimigosGerados = new ArrayList<>();
        this.posicoesInimigos = config.getPosicoes();
        gerarInimigos();
    }

    public void gerarInimigos(){
        Random random = new Random();
        Inimigo aux;
        if(tipo == 4){
            aux = inimigos.get(0);
            inimigosGerados.add(new Inimigo(aux.getNome(), aux.getVida(), aux.getAtaque(), aux.getDefesa(), aux.getValor()));
        } else {
        for(int j = 0; j < posicoesInimigos.size(); j++){
            int i = random.nextInt(4);
            aux = inimigos.get(i);
            inimigosGerados.add(new Inimigo(aux.getNome(), aux.getVida(), aux.getAtaque(), aux.getDefesa(), aux.getValor()));
        }
        }
    }

    public void atualizarMapa() {
        for (String[] linha : mapa) {
            for (int j = 0; j < linha.length; j++) {
                if (linha[j].equals("J") || linha[j].equals("I")) {
                    linha[j] = ".";
                }
            }
        }
        
        if(this.tipo != 4){
            mapa[loja.getLocalizacao()[0]][loja.getLocalizacao()[1]] = "M";
            mapa[fim[0]][fim[1]] = "F";
        }

        int[] posJogador = jogador.getLocalizacao();
        mapa[posJogador[0]][posJogador[1]] = "J";

        for (Tesouro t : tesouros) {
            int[] posTesouro = t.getLocalizacao();
            mapa[posTesouro[0]][posTesouro[1]] = "T";
        }
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }    
    
    public void exibirLabirinto() {
        limparTela();
        atualizarMapa();

        for (String[] linha : mapa) {
            for (String celula : linha) {
                System.out.print(celula);
            }
            System.out.println();
        }

        System.out.println("Vida: " + jogador.getVida() + "/" + jogador.getVidaMAX());
    }

    public boolean verificarFim() {
        int[] loc = jogador.getLocalizacao();
        return loc[0] == 4 && loc[1] == 0;
    }

    public int getDificuldade(){
        return dificuldade;
    }

    public List<Tesouro> getTesouros() {
        return tesouros;
    }

    public List<Diario> getDiarios() {
        return diarios;
    }

    public Loja getLoja() {
        return loja;
    }

    public int getAltura() {
        return mapa.length;
    }

    public int getLargura() {
        return mapa[0].length;
    }

    public String[][] getMapa() {
        return mapa;
    }

    public int[] getFim(){
        return fim;
    }

    public List<Inimigo> getInimigosGerados() {
        return inimigosGerados;
    }

    public List<int[]> getPosicoes() {
        return posicoesInimigos;
    }

    public int getTipo(){
        return tipo;
    }

    public boolean getTrocar(){
        return trocar;
    }

    public void setTrocar(boolean trocar){
        this.trocar = trocar;
    }

    public void verificarSalaSecreta() {
        int[] pos = jogador.getLocalizacao();
        if (salaSecretaDesbloqueada && pos[0] == 2 && pos[1] == 4) {
            System.out.println("Diego é gay"); 
        }
    }


}
