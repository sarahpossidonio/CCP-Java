package lista1;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exercicio9 {

    public static void main(String[] args) {

        String produto = JOptionPane.showInputDialog("Produto:");
        String sPrecoCompra = JOptionPane.showInputDialog("Preço de Compra:");
        String sPrecoVenda = JOptionPane.showInputDialog("Preço de Venda:");

        float precoCompra = Float.parseFloat(sPrecoCompra);
        float precoVenda = Float.parseFloat(sPrecoVenda);
        float lucro = precoVenda-precoCompra;

        JOptionPane.showMessageDialog(null, "Produto: "+produto +"\n\nLucro: R$ "+lucro);

    }
}
