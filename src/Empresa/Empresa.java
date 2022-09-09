package Empresa;

import javax.swing.*;

public class Empresa {
    private float consumo;

    public Empresa() {
    }

    //FORNECIMENTO = Consumo * tarifa, ou seja KWh x 0.28172
    private float calculoFornecimento(){ return consumo * 0.28172f;}

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    private float calculoICMS(){
        /*
        O valor do ICMS é o fator de multiplicação * o valor do
        fornecimento
        */
        if (consumo <= 200){

            return calculoFornecimento() * 0.136363f;
        } else if (consumo > 200) {

            return calculoFornecimento() * 0.333333f;
        } else {
            return 0;
        }
    }
    private float calculoCOFINS(){

        //O valor do COFINS é o fator de multiplicação * o valor do
        //fornecimento

        if (consumo <= 200){
            return calculoFornecimento() * 0.0614722f;
        } else if (consumo > 200) {
            return calculoFornecimento() * 0.0730751f;
        } else {
            return 0;
        }
    }
    private float calculoPIS_PASEP(){

        if (consumo <= 200){
            return calculoFornecimento() * 0.013346f;
        } else if (consumo > 200) {
            return calculoFornecimento() * 0.0158651f;
        } else {
            return 0;
        }                                                   
    }

    private float calculoICMSsobreCOFINS(){ return (calculoICMS() * calculoCOFINS()) / (calculoFornecimento()) ;}

    private float calculoICMSsobrePIS_PASEP(){ return (calculoICMS() *calculoPIS_PASEP()) / (calculoFornecimento());}

    //Fator de multiplicação é gerado pela cobrança ilegal de
    //imposto sobre o imposto por parte da concessionária de
    //energia elétrica.

    public void fatura(){

        float fatura = calculoFornecimento() + calculoICMS() + calculoCOFINS() +
                calculoICMSsobrePIS_PASEP() + calculoICMSsobreCOFINS() +
                calculoICMSsobrePIS_PASEP();

        JOptionPane.showMessageDialog(null,
                "Fornecimento = " + calculoFornecimento() +
                        "\nICMS = " + calculoICMS() +
                        "\nCOFINS = " + calculoCOFINS() +
                        "\nPIS/PASESP = " + calculoPIS_PASEP() +
                        "\nICMS SOBRE COFINS = " + calculoICMSsobreCOFINS() +
                        "\nICMS SOBRE PIS/PASESP = " + calculoICMSsobrePIS_PASEP() +
                        "\nFATURA = " + fatura, "Resultado",JOptionPane.DEFAULT_OPTION
                );
    }



}
