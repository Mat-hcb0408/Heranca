package empregado;

public class Vendedor extends Empregado{
    private float percentualComissao;

    public Vendedor(){ }

    public float getPercentualComissao() {
        return percentualComissao=20f;
    }

    public Vendedor(String nome, float salario) {
        super(nome, salario);
        this.percentualComissao=20f;
    }



    public float calcularSalario(){
        return salario+(salario*percentualComissao/100f);
    }

    @Override
    public String toString() {
        return String.format("Vendedor-%spercentual de comissão: %.2f%% \nSalário com comissão: $%.2f \n",super.toString(),percentualComissao,calcularSalario());

    }
}
