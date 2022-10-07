package lista1;

import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {

        String sFahrenheit = JOptionPane.showInputDialog("Fahrenheit:");

        float fahrenheit = Float.parseFloat(sFahrenheit);
        float celsius = ((fahrenheit-32)*5)/9;

        JOptionPane.showMessageDialog(null, "Celsius: "+celsius);

    }
}
