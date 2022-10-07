package lista1;

import javax.swing.*;

public class Exercicio6 {

    public static void main(String[] args) {

        String sDistancia = JOptionPane.showInputDialog("Distância Total Percorrida:");
        String sCombustivel = JOptionPane.showInputDialog("Combustível Gasto:");

        float distancia = Float.parseFloat(sDistancia);
        float combustivel = Float.parseFloat(sCombustivel);
        float consumo = distancia/combustivel;

        JOptionPane.showMessageDialog(null, "A média de consumo é: "+consumo);


    }
}
