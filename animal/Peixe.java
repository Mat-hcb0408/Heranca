package animal;

public class Peixe extends Animal{
    private String caracterisca;

    public Peixe(){ }

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracterisca) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracterisca = caracterisca;
    }

    public String getCaracterisca() {
        return caracterisca;
    }

    public void setCaracterisca(String caracterisca) {
        this.caracterisca = caracterisca;
    }

    public void dadosPeixe(){
        super.dados();
        System.out.printf("Característica: "+getCaracterisca()+
                "%n========================================%n");
    }
}
