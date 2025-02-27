package empregado;

public class Gerente extends Empregado{
    private String departamento;

    public Gerente(){ }

    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("Gerente- %sDepartamento: %s\n",super.toString(),departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
