package ead_aluno_corrigido;

public class Aluno {
    //todos os atributos estão privados, ou seja, encapsulados
    private String nome;
    private int idade;
    private double nota;

    //construtor com this., diferenciando os atributos da classe dos parâmetros do construtor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    //getters e setters para acessar e modificar os atributo da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //método para exibir os resultados
    public void exibirDados() {
        System.out.println("------------------------------------------------------");
        //uso indireto dos atributos, respeitando o encapsulamento
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nota: " + getNota());

        //condição para aprovação
        if (nota >= 7)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
    }
}
