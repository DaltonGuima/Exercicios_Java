package Ex4;

public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(1500f, 500,"Fulano",0);
        v1.calcularSalario();
        v1.imprimirDados();
    }
}
