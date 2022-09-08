package Ex1;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float CalculaAumentoPer(float porcentagem){
        salario += salario*(porcentagem/100);

        return salario;
    }

    public float CalculaAumentoTempo(int tempo){

        salario += (150*tempo);

        return salario;
    }
}
