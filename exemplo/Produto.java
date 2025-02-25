package exemplo;

public class Produto {
    private String nome;
    private  String marca;
    private double valor;
    private int quantidade;

    public Produto(){ }

    public Produto(String nome, String marca, int quantidade, double valor) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void exibirProduto(){
        System.out.println("----------Informações produto----------");
        System.out.println("Nome: "+getNome());
        System.out.println("Marca: "+getMarca());
        System.out.println("Quantidade: "+getQuantidade());
        System.out.println("Valor: "+getValor());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
