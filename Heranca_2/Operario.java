package Heranca_2;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBase=super.calcularSalario();
        double valorComissao=(getComissao()/100)*getValorProducao();
        return salarioBase+valorComissao;
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Operário-");
        super.exibirPessoa();
        System.out.printf("Valor da produção: $%.2f%n" +
                "Comissão: %.2f%%%n",getValorProducao(),getComissao());
        System.out.println("=======================================");
    }
}
