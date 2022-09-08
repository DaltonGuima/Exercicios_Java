package Ex3;

import javax.swing.*;

public class Torneio {
     private String nome, categoria;
     private int idade;

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaCategoria(){

        if (idade >= 5 && idade <= 7) categoria = "Infantil";
        if (idade >= 8 && idade <= 10) categoria = "Juvenil";
        if (idade >= 11 && idade <= 15) categoria = "Adolescente";
        if (idade >= 16 && idade <= 30) categoria = "Adulto";
        if (idade > 30) categoria = "Sênior";

        return categoria;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null,nome + " é da categoria: " + categoria + ", com "
                + idade + " anos");
    }
}
