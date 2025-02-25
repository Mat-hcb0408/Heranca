package ingresso;

public class Vip extends Ingresso{
    private double ingressoVip;
    public Vip(){
        super();
    }
    public Vip(double valor){
        super(valor);
        this.ingressoVip=ingressoVip;
    }

    @Override
    public void imprimirValor() {
        super.imprimirValor();
        System.out.println("Ingresso VIP");
    }

    public double getIngressoVip() {
        return ingressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }
}
