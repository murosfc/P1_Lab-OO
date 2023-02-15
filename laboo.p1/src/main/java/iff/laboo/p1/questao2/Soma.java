package iff.laboo.p1.questao2;

public class Soma extends ExpressaoBinaria{

    public Soma(Expressao operandoEsquerda, Expressao operandodireita) {
        super(operandoEsquerda, operandodireita);
    }
    
    @Override
    public double avaliar() {
        return this.getOperandoEsquerda().avaliar() + this.getOperandoDireita().avaliar();
    }
    
}
