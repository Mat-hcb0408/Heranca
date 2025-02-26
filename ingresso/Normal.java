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

    public void imprimirValor() {
        System.out.println("------------------------------------------");
        System.out.println("Ingresso Normal- ");
        super.imprimirValor();
        System.out.println("------------------------------------------");
    }
}
