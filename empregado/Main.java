package empregado;

public class Main {
    public static void main(String[] args) {
        Empregado e1=new Empregado("Pedro", 4000.5F);
        System.out.println(e1);

        Gerente g1=new Gerente("Bruce Wayne",1000000000F,"Projetos especiais");
        System.out.println(g1);

        Vendedor v1=new Vendedor("Jim Halpert",3500.75f);
        System.out.println(v1);
    }
}
