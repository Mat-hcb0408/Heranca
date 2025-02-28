package Heranca_2;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor=new Fornecedor("Walter White","(505) 261-4866","Albuquerque",2000,1400);
        fornecedor.exibirPessoa();

        Empregado empregado=new Empregado(" Mike Ehrmantraut","(505) 581-1926","Albuquerque",111,2500.5,15);
        empregado.exibirPessoa();

        Administrador administrador=new Administrador("Saul Goodman","(505) 370-7017","Albuquerque",222,3300,20,15.6);
        administrador.exibirPessoa();

        Operario operario=new Operario("Jesse Pinkman","(505) 257-4521","Albuquerque",123,4000,20,5000,10);
        operario.exibirPessoa();

        Vendedor vendedor=new Vendedor("Jim Halpert","(917) 555-2378","Scranton",321,4500,23,10000.45,25);
        vendedor.exibirPessoa();
    }
}
