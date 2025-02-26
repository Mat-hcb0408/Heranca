package ingresso;

public class Main {
    public static void main(String[] args) {
        Normal i1=new Normal();
        i1.imprimirValor();

        Vip v1=new Vip();
        v1.imprimirValor();

        //Camarote_inferior c1=new Camarote_inferior("Setor A");
        //c1.imprimirLocalizacao();

        Camarote_superior cs1=new Camarote_superior();
        cs1.imprimirValor();
    }
}
