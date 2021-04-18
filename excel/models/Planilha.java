package models;

public class Planilha {
    protected Celula[][] celula;

    public Planilha(Celula[][] celula) {
        this.celula = celula;
    }

    public Celula[][] getCelula() {
        return celula;
    }

    public void setCelula(Celula[][] celula) {
        this.celula = celula;
    }
}
