package animal;

public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero mamifero =new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"");
        mamifero.dadosMamifero();

        Peixe peixe=new Peixe("Tubarão",300,0,"Cinzento","Mar",1.5f,"Barbatanas e cauda");
        peixe.dadosPeixe();

        Mamifero mamifero1=new Mamifero("Urso-do-canadá",180,4,"Vermelho","Terra",0.5f,"Mel");
        mamifero1.dadosMamifero();
    }
}