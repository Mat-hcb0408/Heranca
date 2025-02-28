package Heranca_2;

public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double valorComissao=(getComissao()/100)*getValorVendas();
        return salarioBase+valorComissao;
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Vendedor-");
        super.exibirPessoa();
        System.out.printf("Valor das vendas: $%.2f%n" +
                "Comissão: %.2f%%%n",getValorVendas(),getComissao());
        System.out.println("=======================================");
    }
}
