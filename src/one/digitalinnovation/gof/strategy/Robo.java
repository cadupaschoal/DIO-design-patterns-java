package one.digitalinnovation.gof.strategy;

public class Robo {

    private Comportamento comportamento;

    public void setCompotamento (Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover () {
        comportamento.mover();
    }

}
