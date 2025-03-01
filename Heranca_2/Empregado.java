package Heranca_2;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }


    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * getImposto() / 100);
    }

    @Override
    public void exibirPessoa() {
        super.exibirPessoa();
        System.out.printf("Código do setor: %d%n" +
                "Salario base: $%.2f%n" +
                "Imposto: %.2f%%%n" +
                "Salario líquido: $%.2f%n", getCodigoSetor(), getSalarioBase(), getImposto(), calcularSalario());
    }
}
