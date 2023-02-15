package iff.laboo.p1;

import iff.laboo.p1.questao2.Divisao;
import iff.laboo.p1.questao2.Literal;
import iff.laboo.p1.questao2.Multiplicacao;
import iff.laboo.p1.questao2.Soma;
import iff.laboo.p1.questao2.Subtracao;

public class LabooP1 {

    public static void main(String[] args) {
        Literal um = new Literal(1);
        Literal dois = new Literal(2);
        Literal tres = new Literal(3);
        Literal quatro = new Literal(4);
        Literal doze = new Literal(12);
        
        Subtracao sub = new Subtracao(um, dois);
        Divisao div = new Divisao(quatro, doze);
        Multiplicacao mult = new Multiplicacao(sub,tres);
        Soma soma = new Soma(mult, div);
        System.out.println("Resultado da árvore = " + soma.avaliar());
    }
}
