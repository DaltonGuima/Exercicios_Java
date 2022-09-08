package Empresa;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empresa x = new Empresa();

        x.setConsumo(Float.parseFloat(JOptionPane.showInputDialog("Digite o seu consumo em KWh::")));
        x.fatura();
    }
}
