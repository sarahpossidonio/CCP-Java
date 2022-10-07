package lista1;

import javax.swing.*;

public class Exercicio7 {

    public static void main(String[] args) {

        String aluno = JOptionPane.showInputDialog("Nome do Aluno");
        String sNota1 = JOptionPane.showInputDialog("Nota 1:");
        String sNota2 = JOptionPane.showInputDialog("Nota 2:");
        String sNota3 = JOptionPane.showInputDialog("Nota 3:");

        float nota1 = Float.parseFloat(sNota1);
        float nota2 = Float.parseFloat(sNota2);
        float nota3 = Float.parseFloat(sNota3);
        float media = (nota1+nota2+nota3) /3;

        JOptionPane.showMessageDialog(null, "Aluno: "+aluno+"\nMédia: "+media);

    }
}
