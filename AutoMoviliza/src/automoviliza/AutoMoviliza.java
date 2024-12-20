package automoviliza;

import Bd.Conexion;
import vista.MenuPrincipal;


public class AutoMoviliza {
    public static void main(String[] args) {

        Conexion cx;
        cx = new Conexion();
        cx.conectar();
        
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);


    }
    
}
