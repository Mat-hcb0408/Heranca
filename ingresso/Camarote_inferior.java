package ingresso;

public class Camarote_inferior extends Vip{
    private String localizacao;

    public Camarote_inferior(){ }

    public Camarote_inferior(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.print("Localização no camarote: "+localizacao);
    }
}
