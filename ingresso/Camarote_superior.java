package ingresso;

public class Camarote_superior extends Vip{
    private double adicionalSup=30;

    public Camarote_superior(){
    }

    public double getAdicionalSup() {
        return adicionalSup;
    }

    public double valorSup(){

        return adicionalSup =ValorVIP()+getAdicionalSup();
    }

    @Override
    public void imprimirValor() {
        System.out.println("Ingresso VIP no camarote superior: R$"+valorSup());
    }
}
