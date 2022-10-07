package start;

import javax.swing.*;

public class SistemaBiblioteca {

    public static void main (String[] args){

        String livro1 = JOptionPane.showInputDialog("Qual o nome do livro?");
        String livro2 = JOptionPane.showInputDialog("Qual o nome do livro?");
        String livro3 = JOptionPane.showInputDialog("Qual o nome do livro?");
        String livro4 = JOptionPane.showInputDialog("Qual o nome do livro?");
        String livro5 = JOptionPane.showInputDialog("Qual o nome do livro?");

        String mensagem = "Lista de Livros: \n\n" +
                "Livro 1: "+livro1+"\n" +
                "Livro 2: "+livro2+"\n" +
                "Livro 3: "+livro3+"\n" +
                "Livro 4: "+livro4+"\n" +
                "Livro 5: "+livro5+"\n";
        JOptionPane.showMessageDialog(null, mensagem);




    }

}
