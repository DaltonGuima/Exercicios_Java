package Ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float base,altura;

        // Por Usuário
        Triangulo tri = new Triangulo();
        base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base"));
        tri.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Informe a altura")));
        tri.setBase(base);
        tri.calculaArea();

        // Por Parâmetro
        Triangulo trip = new Triangulo(10.2f,50);
        trip.calculaArea();
    }
}
