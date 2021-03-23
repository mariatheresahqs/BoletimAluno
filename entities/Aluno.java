package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public String aprovacao(){
        if (notaFinal() >= 60.0) return "Aprovado\n";
        else return "Reprovado\n" + "Faltaram " + (60.0 - notaFinal()) + "pontos.\n";
    }

    public double pontosFaltantes(){
        return 60.0 - notaFinal();
    }

    public String toSting(){
        return "Nome:"
        + nome
        + "\nNota final:"
        + notaFinal()
        + "\nSituaçao na disciplina: "
        + aprovacao();
    }
}
