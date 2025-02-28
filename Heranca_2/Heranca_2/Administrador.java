package Heranca_2;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario(){
        return super.calcularSalario()-(getSalarioBase()*getAjudaDeCusto()/100);
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Administrador-");
        super.exibirPessoa();
        System.out.printf("Ajuda de custo: %.2f%%%n",getAjudaDeCusto());
        System.out.println("=======================================");
    }
}
