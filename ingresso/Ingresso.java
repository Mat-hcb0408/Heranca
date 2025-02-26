package ingresso;

public class Ingresso {
    private double valor=50;

    public Ingresso(){}

    public Ingresso(double valor){
        this.valor=valor;
    }
    public void imprimirValor(){
        System.out.println("Valor: R$"+getValor());
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
