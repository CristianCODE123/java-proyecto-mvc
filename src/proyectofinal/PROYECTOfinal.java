
package proyectofinal;

import controlador.ctrRegistrarse;
import controlador.ctrlIniciarSesion;
import javax.swing.JLabel;
import modelo.Cliente;
import modelo.Consultas;
import vista.Registrarse;
import vista.inicioSesion;
import vista.principal;
import vista.verPublicacionesCatalogo;

public class PROYECTOfinal {


    public static void main(String[] args) {
        Consultas con = new Consultas();
        Cliente cli = new Cliente();
        inicioSesion ini = new inicioSesion();
        principal prin = new principal();
        ctrlIniciarSesion login = new ctrlIniciarSesion(con,ini,cli,prin);
        login.iniciar();
        ini.setVisible(true);
        
        

        
    }
    
}
