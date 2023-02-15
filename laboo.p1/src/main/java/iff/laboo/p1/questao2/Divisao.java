package iff.laboo.p1.questao2;

public class Divisao extends ExpressaoBinaria{

    public Divisao(Expressao operandoEsquerda, Expressao operandodireita) {
        super(operandoEsquerda, operandodireita);
    }
    
    @Override
    public double avaliar() {
        return this.getOperandoEsquerda().avaliar() / this.getOperandoDireita().avaliar();
    }
    
}
