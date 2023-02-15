package iff.laboo.p1.questao2;


public class Literal implements Expressao {
    private double valor;

    public Literal(double valor) {
        this.valor = valor;
    }    
    
    @Override
    public double avaliar() {
        return this.valor;
    }
    
}
