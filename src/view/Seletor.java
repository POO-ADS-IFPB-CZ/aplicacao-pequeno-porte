package view;

import javax.swing.*;

public class Seletor {

    static void main() {
        ImageIcon icon = new ImageIcon(
                "src/imgs/error.png"
        );
        JOptionPane.showMessageDialog(null,
                "Hello world",
                "Título da janela",
                JOptionPane.ERROR_MESSAGE,
                icon);
    }

}
