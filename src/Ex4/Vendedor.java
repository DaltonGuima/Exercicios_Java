package Ex4;

import javax.swing.*;

public class Vendedor {

    private float vendas, salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Dados do Vendedor: " +
                "\nNome: " + nome +
                "\nVendas: " + vendas +
                "\nSalário: " + salario +
                "\nFaltas: " + falta);
    }

    public float descontoFalta(){
        float descontoFalta;
        descontoFalta = salario/30*falta;
        return descontoFalta;
    }

    public void calcularSalario(){
        salario +=  calculaComissao() - descontoFalta();
    }

    public float calculaComissao(){

        if (vendas > 1000 && vendas < 2000){
            return vendas*0.10f;
        } else {
            if (vendas > 2000) {
               return vendas * 0.15f;
            } else return 0;
        }

    }

}
