package lista1;

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {

        String sHora = JOptionPane.showInputDialog("Hora:");
        String sMinuto = JOptionPane.showInputDialog("Minuto:");
        String sSegundo = JOptionPane.showInputDialog("Segundo:");

        int hora = Integer.parseInt(sHora);
        int minuto = Integer.parseInt(sMinuto);
        int segundo = Integer.parseInt(sSegundo);

        minuto = minuto + (hora*60);
        segundo = segundo + (minuto*60);

        JOptionPane.showMessageDialog(null, "Resultado: "+ segundo);

    }
}
