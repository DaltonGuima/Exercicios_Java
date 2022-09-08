package Ex1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float salario;
        int aumentoPer, anos, opcao;

        //Declaração objeto
        Funcionario fun = new Funcionario();
        fun.setCargo("Assistente");

        Funcionario funp = new Funcionario(10,1000,"Vendedor");

        //Salario
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salário"));

        fun.setSalario(salario);

        Object[] options = {"Aumento por Porcentagem","Aumento por Tempo"};

        opcao = JOptionPane.showOptionDialog(null, "Escolha o tipo de aumento","Aviso" ,
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);

        if (opcao == 0)
        {
            //AumentoPer
            aumentoPer = Integer.parseInt(JOptionPane.showInputDialog("Informe o aumento do Salário em porcentagem"));

            JOptionPane.showMessageDialog(null,"O salário novo é: " + fun.CalculaAumentoPer(aumentoPer));
        }
        else {
            //Aumento em anos
            anos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de anos para o aumento"));

            JOptionPane.showMessageDialog(null,"O salário novo é: " + fun.CalculaAumentoTempo(anos));
        }

    }
}
