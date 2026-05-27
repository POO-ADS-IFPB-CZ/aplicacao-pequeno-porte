package view;

import javax.swing.*;

public class Seletor {

    static void main() {
        ImageIcon icon = new ImageIcon(
                "src/imgs/error.png"
        );
        int retorno = JOptionPane.showConfirmDialog(null,
                "A operação pode ocasionar perda de dados",
                "Selecione uma opção",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        switch (retorno){
            case JOptionPane.CANCEL_OPTION ->
                    System.out.println("Cancelou");
            case JOptionPane.OK_OPTION ->
                    System.out.println("OK");
            case JOptionPane.CLOSED_OPTION ->
                    System.out.println("Fechou");
        }

    }

}
