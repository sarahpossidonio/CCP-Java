package lista1;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {

        String sBase = JOptionPane.showInputDialog("Valor da Base:");
        String sAltura = JOptionPane.showInputDialog("Valor da Altura:");

        float base = Float.parseFloat(sBase);
        float altura = Float.parseFloat(sAltura);
        float area = (base*altura)/2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: "+area);
    }
}
