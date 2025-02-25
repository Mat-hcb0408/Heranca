package exemplo;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse","Kysona",10,190.50);
        p1.exibirProduto();
        Produto p3=new Hardware();
        p3.setQuantidade(20);
        Produto p4=new Hardware("Vega 7","Ryzen",1,2.5,"Nao compensa");
        p4.exibirProduto();
        Produto p5=new Periferico("K500","Machenike",5,120,"USB-C");
        p5.exibirProduto();
    }
}