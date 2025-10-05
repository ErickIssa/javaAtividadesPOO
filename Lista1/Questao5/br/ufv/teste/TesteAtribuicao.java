package br.ufv.teste;

import br.ufv.universidade.Professor;
import br.ufv.universidade.Disciplina;
import br.ufv.universidade.Atribuicao;

public class TesteAtribuicao {

    public static void main(String[] args) {
        Professor professor = new Professor("Mordekaiser da Silva", 1001);
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", true);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        System.out.println(atribuicao.toString());
    }
}
