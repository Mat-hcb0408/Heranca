package ingresso;

public class Ingresso {
    private double valor;

    public Ingresso(){}

    public Ingresso(double valor){
        this.valor=valor;
    }
    public void imprimirValor(){
        System.out.println("Valor: R$"+this.valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
