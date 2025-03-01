package ead_aluno_corrigido;

//subclasse AlunoTecnico da superclasse Aluno
public class AlunoTecnico extends Aluno{
    //Atributo encapsulado
    private String modalidadeTecnico;

    //construtor que chama o construtor da superclasse Aluno e adiciona um novo atributo
    public AlunoTecnico(String nome, int idade, double nota, String modalidadeTecnico) {
        //inicializa os atributos heradados da superclasse classe Aluno
        super(nome, idade, nota);
        //inicializa o atributo específico da classe
        this.modalidadeTecnico = modalidadeTecnico;
    }

    //getters e setters para acessar e modificar o atributo da classe
    public String getModalidadeTecnico() {
        return modalidadeTecnico;
    }

    public void setModalidadeTecnico(String modalidadeTecnico) {
        this.modalidadeTecnico = modalidadeTecnico;
    }

    //indica que esta sobrescrevendo o metodo exibirDados da superclasse Aluno
    @Override
    public void exibirDados() {
        //chama o método exibirDados() da superclasse Aluno
        super.exibirDados();
        //exibe a Modalidade do Curso Técnico
        System.out.println("Modalidade do Curso Técnico: "+getModalidadeTecnico());
        System.out.println("------------------------------------------------------");
    }
}
