package exemplo;

public class Periferico extends Produto {

    private String tipoConexao;
    public Periferico(){
        super();
    }

    public Periferico(String nome, String marca, int quantidade, double valor,String tipoConexao){
        super(nome, marca, quantidade, valor);
        this.tipoConexao = tipoConexao;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Tipo de conexão: "+getTipoConexao());

    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
}
