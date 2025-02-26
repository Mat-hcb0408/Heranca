package ingresso;

public class Vip extends Ingresso{
    private double adicional=20;

    public Vip() { }

    public double ValorVIP() {
        return getValor() + getAdicional();
    }

    @Override
    public void imprimirValor() {
        System.out.println("Ingresso VIP: R$"+ValorVIP());
    }


    public double getAdicional() {
        return adicional;
    }
}
