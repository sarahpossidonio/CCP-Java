package lista1;

import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {

        String sRaio = JOptionPane.showInputDialog("Digite o valor do (R)aio:");

        float raio = Float.parseFloat(sRaio);
        float pi = 3.1415f;
        float area = pi*(raio*raio);

        JOptionPane.showMessageDialog(null, "A área do círculo é: "+area);

    }
}
