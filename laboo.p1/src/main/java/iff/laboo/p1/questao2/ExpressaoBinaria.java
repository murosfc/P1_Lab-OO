package iff.laboo.p1.questao2;


public abstract class ExpressaoBinaria implements Expressao{
    private Expressao operandoEsquerda, operandoDireita;

    public ExpressaoBinaria(Expressao operandoEsquera, Expressao operandodireita) {
        this.operandoEsquerda = operandoEsquera;
        this.operandoDireita = operandodireita;
    }

    public Expressao getOperandoEsquerda() {
        return operandoEsquerda;
    }

    public Expressao getOperandoDireita() {
        return operandoDireita;
    }
    
    
}
