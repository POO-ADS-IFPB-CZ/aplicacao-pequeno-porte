package view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

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
        buttonOK.addActionListener(e ->{
            if(!eMailTextField.getText().contains("@")){
                JOptionPane.showMessageDialog(this,
                        "Digite um e-mail válido",
                        "Mensagem de erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            //TODO: Restante da validação
            String email = eMailTextField.getText();
            String cpf = formattedTextField1.getText();
            String senha = new String(passwordField1.getPassword());
            String area = (String) comboBox1.getSelectedItem();
            String sexo =
                    masculinoRadioButton.isSelected()?
                            "Masculino":"Feminino";
            //TODO: Montar o objeto e chamar o service para salvar
        });
    }

    public static void main(String[] args) {
        TelaExemplo dialog = new TelaExemplo();
//        dialog.pack();
        dialog.setVisible(true);
    }

    private void createUIComponents() {
        formattedTextField1 = new JFormattedTextField();
        try {
            MaskFormatter formatter =
                    new MaskFormatter("###.###.###-##");
            formatter.install(formattedTextField1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
