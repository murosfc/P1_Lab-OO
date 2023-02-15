package iff.laboo.p1.questao2;

public class Multiplicacao extends ExpressaoBinaria{

    public Multiplicacao(Expressao operandoEsquerda, Expressao operandodireita) {
        super(operandoEsquerda, operandodireita);
    }
    
    @Override
    public double avaliar() {
        return this.getOperandoEsquerda().avaliar() * this.getOperandoDireita().avaliar();
    }
    
}
