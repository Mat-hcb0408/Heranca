package ead_aluno_corrigido;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        //Resolve o problema do buffer do Scanner
        sc.nextLine();

        //input da subclasse AlunoTecnico
        System.out.print("Modalidade do Curso Técnico: ");
        String modalidadeTecnico=sc.nextLine();

        //instanciação do objeto AlunoTecnico
        AlunoTecnico alunoTecnico=new AlunoTecnico(nome,idade,nota,modalidadeTecnico);
        //exibe os dados de AlunoTecnico
        alunoTecnico.exibirDados();

        //input da subclasse AlunoGraduacao
        /*System.out.print("Informe o curso específico da Graduação: ");
        String graduacaoEspecifico= sc.nextLine();

        //instanciação do objeto AlunoGraduacao
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(nome, idade, nota, graduacaoEspecifico);
        //exibe os dados de AlunoGraduacao
        alunoGraduacao.exibirDados();
         */

        //fechamento do Scanner
        sc.close();
    }
}
