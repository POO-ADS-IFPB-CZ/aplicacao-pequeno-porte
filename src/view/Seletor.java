package view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Seletor {

    static void main() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Escolher o arquivo");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter(
                "Arquivos de imagem",
                "PNG","JPEG", "GIF"));
        chooser.showDialog(null, "Abrir");

        if(chooser.getSelectedFile() == null){
            System.out.println("Não escolheu nada...");
        }

    }

}
