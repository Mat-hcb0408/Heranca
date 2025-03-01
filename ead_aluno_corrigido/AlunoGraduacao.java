package ead_aluno_corrigido;

//subclasse AlunoGraduacao da superclasse classe Aluno
public class AlunoGraduacao extends Aluno{
    //Atributo encapsulado
    private String graduacaoEspecifico;

    //construtor que chama o construtor da superclasse Aluno e adiciona um novo atributo
    public AlunoGraduacao(String nome, int idade, double nota, String cursoEspecifico) {
        //inicializa os atributos heradados da superclasse classe Aluno
        super(nome, idade, nota);
        //inicializa o atributo específico da classe
        this.graduacaoEspecifico = cursoEspecifico;
    }
    //getters e setters para acessar e modificar o atributo da classe
    public String getGraduacaoEspecifico() {
        return graduacaoEspecifico;
    }

    public void setGraduacaoEspecifico(String graduacaoEspecifico) {
        this.graduacaoEspecifico = graduacaoEspecifico;
    }

    //indica que esta sobrescrevendo o metodo exibirDados da superclasse Aluno
    @Override
    public void exibirDados() {
        //chama o método exibirDados() da superclasse Aluno
        super.exibirDados();
        //exibe o curso específico da Graduação
        System.out.println("curso específico da Graduação: "+getGraduacaoEspecifico());
        System.out.println("------------------------------------------------------");
    }
}
