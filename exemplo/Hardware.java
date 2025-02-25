package exemplo;

public class Hardware extends Produto{
    private String description;

    public Hardware(){
        super();
    }

    public Hardware(String nome, String marca, int quantidade, double valor, String description) {
        super(nome, marca, quantidade, valor);
        this.description = description;
    }

    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Descrição: "+getDescription());
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
