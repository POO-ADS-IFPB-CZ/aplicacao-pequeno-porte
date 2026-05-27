package view;

import javax.swing.*;

public class HelloWorld extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;

    public HelloWorld() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        HelloWorld dialog = new HelloWorld();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
