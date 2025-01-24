package controlador;

import javax.swing.JOptionPane;

public class HelperController {
    
    public void showInformation(String msg){
        JOptionPane.showMessageDialog(null, msg, "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showWarning(String msg){
        JOptionPane.showMessageDialog(null, msg, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public void showError(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }    
    
    public int mostrarOpciones(String opciones[]){
        int seleccion = JOptionPane.showOptionDialog(null,"Elige una opciion:","Descripcion",JOptionPane.DEFAULT_OPTION,
                                                                                     JOptionPane.INFORMATION_MESSAGE,null,opciones, opciones[0]);
        return seleccion;
    }
    
    public String showInputString(String msg,String TextoPredeterminador){
        String input = JOptionPane.showInputDialog(msg,TextoPredeterminador);
        return input;
    }
    
}
