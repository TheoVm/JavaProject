import java.io.Serializable;

public class Perigo implements Serializable{
    private int[] localizacao;
    private int dano;

    public Perigo(int[] localizacao, int dano) {
        this.localizacao = localizacao;
        this.dano = dano;
    }

    public int[] getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int[] localizacao) {
        this.localizacao = localizacao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}

