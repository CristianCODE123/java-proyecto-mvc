
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Cliente;
import modelo.Consultas;
import modelo.Hash;
import vista.Registrarse;


public class ctrRegistrarse implements MouseListener{
    Registrarse register;
    Consultas con;
    Cliente cli;

    public ctrRegistrarse(Registrarse register, Consultas con, Cliente cli) {
        this.register = register;
        this.con = con;
        this.cli = cli;
        this.register.btnRegister.addMouseListener(this);
        
    }
    public void iniciar(){
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.register.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
            
    
    @Override
    public void mouseClicked(MouseEvent e) {
        String pas = new String(register.txtContraseña.getText());
       if(e.getSource() == register.btnRegister){
           if(!register.txtNombre.getText().equals("") && !register.txtApellido.getText().equals("") && !register.txtCorreo.getText().equals("") && !register.txtDni.getText().equals("")
             && !register.txtTelefono.getText().equals("") && !register.txtDireccion.getText().equals("")  && !register.txtContraseña.getText().equals("")){
               
               String fechaNacimiento = register.BoxAño.getSelectedItem()+"-"+register.BoxMes.getSelectedItem()+"-"+register.boxDia.getSelectedItem();
               String nuevaContraseña = Hash.sha1(pas);
               
               if(register.txtNombre.getText().length()<= 2){
               JOptionPane.showMessageDialog(null, "error nombre tiene que ser mayor a 2");
               }else{
                   cli.setNombre(register.txtNombre.getText());
               }
               
               if(register.txtApellido.getText().length() <= 2){
                     JOptionPane.showMessageDialog(null, "error apellido tiene que ser mayor a 2");
               }else{
                   cli.setApellido(register.txtApellido.getText());
               }
               
               if(register.txtCorreo.getText().length() <= 2){
                     JOptionPane.showMessageDialog(null, "error digite correo valido");
               }else{
                   cli.setCorreo(register.txtCorreo.getText());
               }
               
               if(register.txtDni.getText().length() <= 7){
                     JOptionPane.showMessageDialog(null, "error digite dni valido");
               }else{
                  cli.setDni(register.txtDni.getText());
               }
               
               if(register.txtTelefono.getText().length() <= 5){
                     JOptionPane.showMessageDialog(null, "error digite dni valido");
               }else{
                  cli.setTelefono(register.txtTelefono.getText());
               }
               
              if(register.txtDireccion.getText().length() <= 5){
                     JOptionPane.showMessageDialog(null, "error digite direccion valido");
               }else{
                 cli.setDireccion(register.txtDireccion.getText());
               }
              
               if(register.txtContraseña.getText().length() < 8){
                     JOptionPane.showMessageDialog(null, "error digite contraseña con mas digitos que 8");
               }else{
                 cli.setContraseña(nuevaContraseña);
               }
               
               cli.setFecha_nacimiento(fechaNacimiento);
               System.out.println(fechaNacimiento);
               if(con.registrar(cli)){
                   JOptionPane.showMessageDialog(null, "registrado correctamente");
                   System.out.println(fechaNacimiento);
               }else{
                   JOptionPane.showMessageDialog(null, "error");
                   System.out.println(fechaNacimiento);
               }
           }else{
               JOptionPane.showMessageDialog(null, "llene todos los campos");
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
