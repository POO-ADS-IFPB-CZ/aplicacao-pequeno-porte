package view;

import javax.swing.*;

public class TelaExemplo extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField eMailTextField;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JComboBox comboBox1;
    private JPasswordField passwordField1;
    private JFormattedTextField formattedTextField1;

    public TelaExemplo() {
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setTitle("Meu programa");

        ImageIcon icon = new ImageIcon(
                "src/imgs/escola.png");
        setIconImage(icon.getImage());

        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        TelaExemplo dialog = new TelaExemplo();
//        dialog.pack();
        dialog.setVisible(true);
    }
}
