package iff.laboo.p1.questao2;

public class Subtracao extends ExpressaoBinaria{

    public Subtracao(Expressao operandoEsquerda, Expressao operandodireita) {
        super(operandoEsquerda, operandodireita);
    }
    
    @Override
    public double avaliar() {
        return this.getOperandoEsquerda().avaliar() - this.getOperandoDireita().avaliar();
    }
    
}
