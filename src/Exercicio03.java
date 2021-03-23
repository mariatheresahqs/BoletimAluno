package src;

import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Exercicio03{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        // double temp;

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite a nota da primeira prova:");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova:");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a nota da terceira prova:");
        aluno.nota3 = sc.nextDouble();

        System.out.print("Aluno:\n");
        System.out.print(aluno.toSting());

        sc.close();
    }
}