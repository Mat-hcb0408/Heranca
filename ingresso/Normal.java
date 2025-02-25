package ingresso;

public class Normal extends Ingresso{
    private double ingressoNormal;
    public Normal(){
        super();
    }

    public Normal(double valor){
        super(valor);
        this.ingressoNormal=ingressoNormal;
    }

    @Override
    public void imprimirValor() {
        super.imprimirValor();
        System.out.println("Ingresso Normal");
    }

    public double getIngressoNormal() {
        return ingressoNormal;
    }

    public void setIngressoNormal(double ingressoNormal) {
        this.ingressoNormal = ingressoNormal;
    }
}
