package Heranca_2;

public class Fornecedor extends Pessoa {
    double valorCredito;
    double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public void exibirPessoa() {
        System.out.println("Fornecedor-");
        super.exibirPessoa();
        System.out.printf("Valor do crédito: $%.2f%n" +
                "Valor da divida: $%.2f%n" +
                "Saldo: $%.2f%n", valorCredito, valorDivida, obterSaldo());
    }
}
