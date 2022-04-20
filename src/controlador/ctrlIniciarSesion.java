
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Cliente2;
import modelo.Consultas;
import modelo.Hash;
import vista.Registrarse;
import vista.inicioSesion;
import vista.principal;



public class ctrlIniciarSesion implements MouseListener {
    Consultas consultas;
    inicioSesion login;
    Cliente cliente;
    principal prin;
    ctrlPrincipal ctrlprin = new ctrlPrincipal();
    
    public ctrlIniciarSesion(Consultas consultas, inicioSesion login, Cliente cliente,principal prin) {
        this.consultas = consultas;
        this.login = login;
        this.cliente = cliente;
        this.prin = prin;
        this.login.btnEntrar.addMouseListener(this);
        this.login.btnRegistrarse.addMouseListener(this);
      
    }
    public void iniciar(){
        login.setVisible(true);
        login.setLocationRelativeTo(null);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == login.btnRegistrarse){
            Registrarse regis = new Registrarse();
            Consultas con = new Consultas();
            Cliente cli1 = new Cliente();
            ctrRegistrarse regis2 = new ctrRegistrarse(regis,con,cli1);
            regis2.iniciar();
            regis.setVisible(true);
        }
        
        
        
        if(e.getSource() == login.btnEntrar){
            if(!login.txtContraseña.getText().equals("") && !login.txtUsuario.getText().equals("")){
                String pass = new String(login.txtContraseña.getText());
                String nuevopassword = Hash.sha1(pass);
       cliente.setCorreo(login.txtUsuario.getText());
       cliente.setContraseña(nuevopassword);
       
       
       if(consultas.Iniciar(cliente)){
           ctrlprin.iniciar();

           login.dispose();
       }else{
           JOptionPane.showMessageDialog(null,"error");
       }    
       }else{
           JOptionPane.showMessageDialog(null,"llene todos los campos");
       }
        }
       
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}
