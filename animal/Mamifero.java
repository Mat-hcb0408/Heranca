package animal;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(){ }

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void dadosMamifero(){
        super.dados();
        System.out.printf("Alimento: "+getAlimento()+
        "%n========================================%n");
    }
}
