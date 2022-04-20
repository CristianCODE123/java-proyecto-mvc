
package controlador;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Catalogo;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Consultas;
import modelo.Hash;
import vista.añadirCatalogo;
import java.sql.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente2;
import modelo.vehiculo_cedido;
import vista.TazarVehiculo;
import vista.editarPublicaciones;
import vista.inicioSesion;
import vista.principal;
import vista.verPublicaciones;
import vista.verPublicacionesCatalogo;


public class ctrlPrincipal implements MouseListener{
    principal prin = new principal();
    inicioSesion ini = new inicioSesion();
    Consultas con = new Consultas();
    Catalogo cat = new Catalogo();
    Cliente cli = new Cliente();
    Cliente2 cli2 = Cliente2.getInstance();
    Conexion conexion = new Conexion();
    añadirCatalogo añadir = new añadirCatalogo();
    File destino;
    JLabel boton1, boton2;
    JLabel etiqueta[] = new JLabel[100];
    JLabel etiqueta9[] = new JLabel[100];
    JLabel etiquetaMisplublicaciones[] = new JLabel[100];
    verPublicaciones publi  = new verPublicaciones();
    verPublicacionesCatalogo publiCatalogo = new verPublicacionesCatalogo();
    editarPublicaciones editpubli = new editarPublicaciones();
    TazarVehiculo tv = new TazarVehiculo();
    
    String modelo1[] = new String[100];
    String marca1[] = new String[100];
    int precio1[] = new int[100];
    String descripcion1[] = new String[100];
    int cc1[] = new int[100];
    int publicacionSeleccionada = 0;
    int n = 0;
    
    public ctrlPrincipal() {
        
        this.prin = prin;
        this.ini = ini;
        publi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        this.publi.lblExitr.addMouseListener(this);
        this.prin.btnCatalogo.addMouseListener(this);
        this.prin.BtnAccederVendedor.addMouseListener(this);
        this.añadir.btnEntrarVendedor.addMouseListener(this);
        this.añadir.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.prin.btnSubirFoto.addMouseListener(this);
        this.prin.btnPrincipal.addMouseListener(this);
        this.prin.btnCatalogo.addMouseListener(this);
        this.prin.btnDevoluciones.addMouseListener(this);
        this.prin.btnVendedores.addMouseListener(this);
        this.prin.btnVender.addMouseListener(this);
        this.prin.btnRegistrarAuto.addMouseListener(this);
        this.prin.btnActualizar.addMouseListener(this);
        this.prin.btnActualizar1.addMouseListener(this);
        this.prin.btnConfiguracion.addMouseListener(this);
        this.prin.BtnEliminarCuenta.addMouseListener(this);
        this.prin.btnVerMisVentas.addMouseListener(this);
        this.prin.editarApellido.addMouseListener(this);
        this.prin.editarContraseña.addMouseListener(this);
        this.prin.editarCorreo.addMouseListener(this);
        this.prin.editarDireccion.addMouseListener(this);
        this.prin.editarNombre.addMouseListener(this);
        this.prin.editarTelefono.addMouseListener(this);
        this.prin.editardni.addMouseListener(this);
        this.boton.addMouseListener(this);
       
        this.editpubli.addMouseListener(this);
        this.editpubli.editCilindraje.addMouseListener(this);
         this.editpubli.editDescripcion.addMouseListener(this);
          this.editpubli.editMarca.addMouseListener(this);
           this.editpubli.editMatricula.addMouseListener(this);
            this.editpubli.editModelo.addMouseListener(this);
             this.editpubli.editPrecio.addMouseListener(this);
              this.editpubli.btnActualizarMipubli.addMouseListener(this);
               this.editpubli.btnSubirFotoActualizar.addMouseListener(this);
               
               this.tv.btnCederVehiculo.addMouseListener(this);
        this.etiqueta2.addMouseListener(this);
        this.publiCatalogo.dispose();
        this.prin.BtnAceptarActualizar.addMouseListener(this);
    }

    
    
    public JLabel boton = new JLabel();
    public void iniciar(){
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
        prin.txtRequisitos.setEditable(false);
        Agregar();
        llenarCatalogo();
        agregarVendedores();
        llenarMispublicaciones();
        llenarVentasRealizadas();
        comprobarCliente();
        
        prin.txtApellido.setEditable(false);
        prin.txtNombre.setEditable(false);
        prin.TxtCorreo.setEditable(false);
        prin.txtDni.setEditable(false);
        prin.txtTelefono.setEditable(false);
        prin.txtContrasñea.setEditable(false);
        prin.txtDireccion.setEditable(false);
        
        String path = new File("src\\imagenes\\folder\\CederVehiculo.png").getAbsolutePath();
       
        System.out.println(path);
        

         
        prin.txtApellido.setText(cli2.getApellido());
        prin.txtNombre.setText(cli2.getNombre());
        prin.TxtCorreo.setText(cli2.getCorreo());
        prin.txtDni.setText(cli2.getDni());
        prin.txtTelefono.setText(cli2.getTelefono());
        prin.txtDireccion.setText(cli2.getDireccion());
        prin.txtContrasñea.setText(cli2.getContraseña());
        
//C:\Users\57321\Desktop\dia2design

        
//        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/informatica.gif"));
//        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbImage.getWidth(),
//                lbImage.getHeight(), Image.SCALE_SMOOTH);
//        Icon iconoEscalado = new ImageIcon(imgEscalada);
//        lbImage.setIcon(iconoEscalado);
       //273x191
       //297x434
    }
    File destino2;
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == prin.BtnAccederVendedor){
            añadir.setVisible(true);
            }
        
        //este es el boton donde se inicia sesion como vendedor
        if(e.getSource() == añadir.btnEntrarVendedor){
            
            String pass = new String(añadir.passwordvendedor.getText());
            String nuevopass = Hash.sha1(pass);
            
            cli.setCorreo(añadir.correovendedor.getText());
            cli.setContraseña(nuevopass);
            System.out.println(cli.getContraseña());
            System.out.println(cli.getCorreo());
            
            if(con.inicio_vendedor(cli)){
                JOptionPane.showMessageDialog(null, "todo en orden");
                prin.PANELGENERAL.setSelectedIndex(3);
                
                
            }else{
                JOptionPane.showMessageDialog(null,"mal");
            }
          }    
        
        // este source sirve para actualizar los datos del cliente es el boton basicamente
        if(e.getSource() == prin.BtnAceptarActualizar){
            
            
            cli.setApellido(prin.txtApellido.getText());
            
            cli.setCorreo(prin.TxtCorreo.getText());
            cli.setDireccion(prin.txtDireccion.getText());
            cli.setDni(prin.txtDni.getText());
            cli.setNombre(prin.txtNombre.getText());
            cli.setTelefono(prin.txtTelefono.getText());
            
            if(con.editarUsuario(cli)){
                JOptionPane.showMessageDialog(null, "actualizado con exito");
            }
          
                //este es igual que el anterior pero actualiza en este caso la contraseña porque todo junto no funcionaba, pero ambos son parte de la misma consulta.                      
            if(e.getSource() == prin.BtnAceptarActualizar && prin.txtContrasñea.isEditable()){
                
              String pass = new String(prin.txtContrasñea.getText());
                String nuevopassword = Hash.sha1(pass);
              cli.setContraseña(nuevopassword);
              if(con.editarUsuariocontraseña(cli)){
                JOptionPane.showMessageDialog(null, "actualizado con exito");
            }
          }  
        }
                // basicamente sirve para que se pueda subir la foto cuando damos al boton.
        if(e.getSource() == prin.btnSubirFoto){
                JFileChooser filechooser = new JFileChooser(); //creamos el filechooser para seleccionar una imagen
                int response = (filechooser.showOpenDialog(null));  //hacemos la respuesta como un entero
                
                if(response == JFileChooser.APPROVE_OPTION){  //si hay respuesta
                    File file = new File(filechooser.getSelectedFile().getName());  //creame un tipo File para guardar la ruta absoluta de la imagen
                    File archivo = filechooser.getSelectedFile();  //creame un file/archivo para obtener el nombre de archivo
                    prin.txtFoto.setText(file.toString());
                    
                File origen = new File(filechooser.getSelectedFile().getAbsolutePath());
                destino = new File("src\\imagenesbd\\carpetaImg\\"+archivo.getName());

                try {
                        InputStream in = new FileInputStream(origen);
                        OutputStream out = new FileOutputStream(destino);

                        byte[] buf = new byte[1024];
                        int len;

                        while ((len = in.read(buf)) > 0) {
                                out.write(buf, 0, len);
                        }

                        in.close();
                        out.close();
                } catch (IOException ioe){
                        ioe.printStackTrace();
                }
                    
                }
            }
                //este sirve para subir la foto a la hora de actualizar la informacion de MIS PUBLICACIONES.
        if(e.getSource() == editpubli.btnSubirFotoActualizar){
                 editpubli.txtFotoEdit.setText("");
                JFileChooser filechooser = new JFileChooser(); //creamos el filechooser para seleccionar una imagen
                int response = (filechooser.showOpenDialog(null));  //hacemos la respuesta como un entero
               
                if(response == JFileChooser.APPROVE_OPTION){  //si hay respuesta
                    File file = new File(filechooser.getSelectedFile().getName());  //creame un tipo File para guardar la ruta absoluta de la imagen
                    File archivo = filechooser.getSelectedFile();  //creame un file/archivo para obtener el nombre de archivo
                    editpubli.txtFotoEdit.setText(file.toString());
                    
                File origen = new File(filechooser.getSelectedFile().getAbsolutePath());
                destino2 = new File("src\\imagenesbd\\carpetaImg\\"+archivo.getName());
                                                
                try {
                        InputStream in = new FileInputStream(origen);
                        OutputStream out = new FileOutputStream(destino2);

                        byte[] buf = new byte[1024];
                        int len;

                        while ((len = in.read(buf)) > 0) {
                                out.write(buf, 0, len);
                        }

                        in.close();
                        out.close();
                } catch (IOException ioe){
                        ioe.printStackTrace();
                }
                    
                }
            }
        
        
        //estos son los botones del menu principal
        if(e.getSource() == prin.btnPrincipal){
            prin.PANELGENERAL.setSelectedIndex(0);
        }
        if(e.getSource() == prin.btnCatalogo){
            prin.PANELGENERAL.setSelectedIndex(1);
        }
        if(e.getSource() == prin.btnDevoluciones){
            prin.PANELGENERAL.setSelectedIndex(2);
        }
        if(e.getSource() == prin.btnVendedores){
            prin.PANELGENERAL.setSelectedIndex(5);
        }
        if(e.getSource() == prin.btnVender){
            prin.PANELGENERAL.setSelectedIndex(4);
        }
        if(e.getSource() == prin.btnVerMisVentas){
            prin.PANELGENERAL.setSelectedIndex(7);
        }
        //estos source son para cuando queramos editar algo del cliente en el panel de configuracion y activa los txtfield
        if(e.getSource() == prin.editarNombre){
            prin.txtNombre.setEditable(true);
        }
        if(e.getSource() == prin.editarApellido){
            prin.txtApellido.setEditable(true);
        }
        if(e.getSource() == prin.editarCorreo){
            prin.TxtCorreo.setEditable(true);
        }
        if(e.getSource() == prin.editarTelefono){
            prin.txtTelefono.setEditable(true);
        }
        if(e.getSource() == prin.editarContraseña){
            prin.txtContrasñea.setEditable(true);
        }
        if(e.getSource() == prin.editardni){
            prin.txtDni.setEditable(true);
        }
        if(e.getSource() == prin.editarDireccion){
            prin.txtDireccion.setEditable(true);
        }
        
         //estos source son para cuando queramos editar algo del cliente en el panel de editar mis publicaciones y activa los txtfield
         if(e.getSource() == editpubli.editCilindraje){
             editpubli.txtCilindraje.setEditable(true);
         }
         if(e.getSource() == editpubli.editDescripcion){
             editpubli.txtDescripcion.setEditable(true);
         }
         if(e.getSource() == editpubli.editMarca){
             editpubli.txtMarca.setEditable(true);
         }
         if(e.getSource() == editpubli.editMatricula){
             editpubli.txtMatricula.setEditable(true);
         }
         if(e.getSource() == editpubli.editModelo){
             editpubli.txtModelo.setEditable(true);
         }
         if(e.getSource() == editpubli.editPrecio){
             editpubli.txtPrecio.setEditable(true);
         }
        
        //esto es el registro del catalogo a nivel controlador.
        if(e.getSource() == prin.btnRegistrarAuto){
          if(!prin.txtCilindrage.getText().equals("") && !prin.txtDescripcion.getText().equals("") && !prin.txtMarca.getText().equals("") && !prin.txtMatricula.getText().equals("")
             && !prin.txtModelo.getText().equals("") && !prin.txtPrecio.getText().equals("")  && !prin.txtFoto.getText().equals("")){  
           
            cat.setCilindrage(Integer.parseInt(prin.txtCilindrage.getText()));
            cat.setDescripcion(prin.txtDescripcion.getText());
            cat.setMarca(prin.txtMarca.getText());
            cat.setMatricula(prin.txtMatricula.getText());
            cat.setModelo(prin.txtModelo.getText());
            cat.setPrecio(Integer.parseInt(prin.txtPrecio.getText()));
            ImageIcon nombre = new ImageIcon(new File("src\\imagenesbd\\carpetaImg\\"+prin.txtFoto.getText()).getAbsolutePath().toString());
            cat.setNombre(nombre.toString());
            cat.setNombre2(prin.txtFoto.getText());
            if(con.AgregarCatalogo(cat)){
                JOptionPane.showMessageDialog(null, "felicidades");
                        
            }
            
        }
        }
        
        
        if(e.getSource() == prin.btnActualizar){
            llenarCatalogo();
        }
        if(e.getSource() == prin.btnActualizar1){
            llenarCatalogo();
        }
        
        //desde aqui podemos ver las publicaciones subidas dependiendo de cual etiqueta precionemos (i)
        for(int i=0;i<etiqueta.length;i++){
             
        if(e.getSource() == etiqueta[i]){
            int id = Integer.parseInt(etiqueta[i].getName()); 
            System.out.println(id + " id");
            verPublicaciones(id);
              
               break;
        }
        }
        
        //desde aqui empieza el proceso de configuracion de botones para la compra del producto
        int j = 0;
         for(j=0;j<etiqueta9.length;j++){
        if(e.getSource() == etiqueta9[j]){
          
            parametrosCatalogo(modelo1[j], marca1[j], precio1[j], cc1[j], descripcion1[j]);
            System.out.println(modelo1[j]);
            System.out.println(etiqueta9[j].getName());
          
            break;
        }
        }
         int c = j;
         
         
         
        if(e.getSource() == prin.btnConfiguracion){
            prin.PANELGENERAL.setSelectedIndex(6);
        }
        
        // cuando pulsamos el boton de comprar, se añade la compra a la base de datos.
        if(e.getSource() == etiqueta2){
            if(vc.getMarca() == null){
                añadirVenta();
            }else{
                añadirVentaConVehiculoTazado();
            }
            
            System.out.println("x");
        }
        //cuando pulsamos el boton nos tira al formulario para llenar vehiculo a tazar
        if(e.getSource() == etiqueta5){
            
            tv.setVisible(true);
        }
        
        if(e.getSource() == tv.btnCederVehiculo){
            tazarVehiculoSingleton();
            actualizarVentaConTazar();
            System.out.println(c + "c");
            publiCatalogo.panelVermas1.updateUI(); //actualizamos el panel donde vemos la publicacion, para que se agreguen las etiquetas con el metodo, actualizaventacontaazar()
            JOptionPane.showMessageDialog(null, "Usted ha cedido el vehiculo de marca: "+vc.getMarca()+" modelo: "+vc.getModelo()+
                    " el precio se determinara en el concecionario y se hara el devido descuento");
            
             tv.dispose();
            
        }
        
        
        
        //cuando vamos a eliminar cuenta, se pregunta, si o no, luego si selecciona si, se elimina.
        if(e.getSource() == prin.BtnEliminarCuenta){
            int result = JOptionPane.showConfirmDialog(null,"¿de verdad desea eliminar esta cuenta?", "Eliminar cuenta",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               eliminarCuenta();
               JOptionPane.showMessageDialog(null, "Cuenta eliminada correctamente");
            }else if (result == JOptionPane.NO_OPTION){
              
            }else {
               
            }
            
        }
        int k= 0;
        //desde aqui es donde podemos precionar el boton de ver mis publicaciones.
         for( k=0;k<etiquetaMisplublicaciones.length;k++){
        if(e.getSource() == etiquetaMisplublicaciones[k]){
            llenarActualizarMisPublicaciones(marca3[k], modelo3[k], cilindraje3[k], precio3[k],matricula3[k]);
            System.out.println("x");
            
            
        }
            }
         
        
            
            if(e.getSource() == editpubli.btnActualizarMipubli){
                prin.PanelPublicaciones.removeAll();
                System.out.println(marca4);
                actualizarMisPlublicaciones();
                llenarMispublicaciones();
                
                  System.out.println("x");
               
         }
            for(int l=0;l<botoneliminar.length;l++){
                if(e.getSource() == botoneliminar[l]){
                    System.out.println("x");
                    eliminarmisPublicaciones(botoneliminar[l].getName());
                    break;
               
           }
            
            }
           
    }
    
    DefaultTableModel model;
    public void llenarVentasRealizadas(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select ventas.idventas, cliente.idcliente, cliente.nombre, cliente.apellido, cliente.correo,ventas.idvendedor,catalogo.idcatalogo,marca,modelo,catalogo.precio  from ventas\n" +
"inner join cliente\n" +
"on ventas.idcliente = cliente.idcliente\n" +
"inner join catalogo\n" +
"on ventas.idCatalogo = catalogo.idCatalogo";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
         model =(DefaultTableModel)(prin.tablaventas.getModel());
        model.addRow(new Object[]{
            rs.getString("ventas.idventas"),
            rs.getString("cliente.idcliente"),
            rs.getString("cliente.nombre"),
            rs.getString("cliente.apellido"),
            rs.getString("ventas.idvendedor"),
            rs.getString("catalogo.idcatalogo"),
            rs.getString("marca"),
            rs.getString("modelo"),
            rs.getInt("catalogo.precio")
           
        
        });
            }
        } catch (SQLException e) {
        }
    }
    
    public void limpia() {
        publi.panelVermas.removeAll();
        //jpActivitiesAll.validate();
        publi.panelVermas.revalidate(); //Parece ser que esto recarga la ventana
        
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
       limpia();
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
    //forma numero 1 de contar el id;
    public int contar_num_personajes() throws SQLException{ 
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs;
        int n= 0;
        try {
            Statement stm =  con.createStatement();
            rs = stm.executeQuery("select count(idCatalogo)from catalogo");
            if(rs.next()){
                n = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return n;
}
    //forma numero 2 de contar el id y retornarlo
    public int idcount(){
        int n = 0;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select count(idCatalogo)from catalogo";
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            if(rs.next()){
                n = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return n;
    }
    
    public void comprobarCliente(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select tipo_usuario.idcliente from tipo_usuario where idcliente = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli2.getIdCliente());
            rs = ps.executeQuery();
            if(rs.next()){
                prin.btnVerMisVentas.setVisible(true);
                prin.PanelColorverVentas.setVisible(true);
            }else{
                prin.btnVerMisVentas.setVisible(false);
                prin.PanelColorverVentas.setVisible(false);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void llenarCatalogo(){
        
        
       Connection con = conexion.getConexion();
       Catalogo cat = new Catalogo();
       PreparedStatement ps = null;
       ResultSet rs = null;
       int n = 0;
       try {
           String sql = "select catalogo.idCatalogo,marca,modelo,cilindraje,precio,matricula,opciones_adicionales.nombre,opciones_adicionales.descripcion from catalogo\n" +
                        "inner join opciones_adicionales\n" +
                        "on catalogo.idCatalogo = opciones_adicionales.idCatalogo ";
           
ImageIcon img10 = new ImageIcon(new File("src\\imagenesPrincipal\\carpetaImg\\encabezado.jpg").getAbsolutePath().toString());
        JLabel etiqueta10 = new JLabel(img10);
        etiqueta10.setBounds(146,40,674,164);
        etiqueta10.setBackground(Color.red);    
        Image imgEscalada10 = img10.getImage().getScaledInstance(etiqueta10.getWidth(),
                etiqueta10.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
        etiqueta2.setIcon(iconoEscalado10);
        
        prin.panelCatalogo.add(etiqueta10);
           
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               n++;
                modelo1[n] = rs.getString("modelo");
                marca1[n] = rs.getString("marca");
                precio1[n] = rs.getInt("precio");
                descripcion1[n] = rs.getString("opciones_adicionales.descripcion");
                cc1[n] = rs.getInt("cilindraje");
               
               cat.setIdcatalogo(rs.getInt("idCatalogo"));
               cat.setMarca(rs.getString("marca"));
               cat.setModelo(rs.getString("modelo"));
               cat.setCilindrage(rs.getInt("cilindraje"));
               cat.setPrecio(rs.getInt("precio"));
               
               
        JLabel marca = new JLabel(rs.getString("marca")+" / "+rs.getString("modelo"));
        marca.setBounds(405,(15*n*15),200,50);
        marca.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel precio = new JLabel(rs.getInt("precio")+"");
        precio.setBounds(405,(15*n*15)+30,110,50);
        precio.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 20));
              
        JLabel cilindraje = new JLabel(rs.getInt("cilindraje")+""+"cc");
        cilindraje.setBounds(405,(15*n*15)+60,90,50);
        cilindraje.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
        ImageIcon img = new ImageIcon(rs.getString("opciones_adicionales.nombre"));
        JLabel etiqueta = new JLabel(img);
        etiqueta.setBounds(145,(15*n*15),230,203);
        
        JLabel descripcion = new JLabel(rs.getString("descripcion"));
        descripcion.setBounds(405,(15*n*15)+90,250,50);
        descripcion.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
        
        etiqueta.setBackground(Color.red);    
        Image imgEscalada = img.getImage().getScaledInstance(etiqueta.getWidth(),
                etiqueta.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        etiqueta.setIcon(iconoEscalado);
        
        prin.jScrollPane3.getVerticalScrollBar().setUnitIncrement(16);
                                    
                                            
        ImageIcon img2 = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_7.png").getAbsolutePath().toString());
        JLabel etiqueta2 = new JLabel(img2);
        etiqueta2.setBounds(110,(15*n*15),750,211);
        etiqueta2.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta2.getWidth(),
                etiqueta2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta2.setIcon(iconoEscalado2);
                                                         
                ImageIcon img3 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\ENCARGARboton.png").getAbsolutePath().toString());
        JLabel etiqueta7 = new JLabel(img3);
        etiqueta7.setBounds(665,(15*n*15)+35+120,101,35);
        etiqueta7.setBackground(Color.red);    
        Image imgEscalada3 = img3.getImage().getScaledInstance(etiqueta7.getWidth(),
                etiqueta7.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        etiqueta7.setIcon(iconoEscalado3);
      
                
        
                    etiqueta9[n]= new JLabel();
            etiqueta9[n].setBounds(665,(15*(n*15)+35)+120,101,35);
            etiqueta9[n].addMouseListener(this);
            etiqueta9[n].setName(n+"");
            etiqueta9[n].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
                prin.panelCatalogo.add(etiqueta9[n]);
                System.out.println(etiqueta9[n].getName()+"  nombre de cada etiqueta");
                prin.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
       
        prin.panelCatalogo.add(etiqueta7);
        prin.panelCatalogo.add(descripcion);
        prin.panelCatalogo.add(marca);
        prin.panelCatalogo.add(precio);
       
        prin.panelCatalogo.add(cilindraje);
        prin.panelCatalogo.add(precio);
        prin.panelCatalogo.add(etiqueta);
        prin.panelCatalogo.add(etiqueta2);
        
               
        prin.panelCatalogo.setPreferredSize(new Dimension(1000,1000*idcount())); //multiplico 250+idcatalogo para que las dimensiones se acomoden a la cantidad de articulos
        
        
           }
       } catch (SQLException e) {
           System.out.println(e);
           
       }
        
        
        
    }
            vehiculo_cedido vc = vehiculo_cedido.getInstance();
            
            public void tazarVehiculoSingleton(){
                
            String fechaSesion = tv.BoxAño.getSelectedItem()+"-"+tv.BoxMes.getSelectedItem()+"-"+tv.boxDia.getSelectedItem();
            vc.setModelo(tv.txtModeloTasacion.getText());
            vc.setMarca(tv.txtMarcaTasacion.getText());
            vc.setMatricula(tv.txtMatriculaTasacion.getText());
            vc.setPrecio(Integer.parseInt(tv.txtPrecioTasacion.getText()));
            vc.setFecha_sesion(fechaSesion);
            vc.setId_cliente(cli2.getIdCliente());
            
            } 
            
            public void actualizarVentaConTazar(){
                                JLabel titulo = new JLabel("Vehiculo cedido");
                titulo.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 20));
                titulo.setBounds(740, 190, 200, 30);
                
                JLabel marca = new JLabel(vc.getMarca());
                marca.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
                marca.setBounds(722, 250, 100, 30);
                
                JLabel modelo = new JLabel(vc.getModelo());
                modelo.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
                modelo.setBounds(722, 280, 100, 30);
                
                JLabel matricula = new JLabel(vc.getMatricula());
                matricula.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
                matricula.setBounds(722, 310, 100, 30);
                
                JLabel precio = new JLabel(vc.getPrecio()+"");
                precio.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
                precio.setBounds(722, 340, 500, 30);
                
                JLabel fecha_sesion = new JLabel(vc.getFecha_sesion());
                fecha_sesion.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
                fecha_sesion.setBounds(722, 370, 100, 30);
                
                JTextArea mensaje = new JTextArea("recuerda que una vez cedido el auto\n" +
"movil, el precio sera determinado\n" +
"en el concecionario, por el vendedor\n" +
"encargado, y una vez determinada\n" +
"la validez del vehiculo, se hara su\n" +
"respectivo descuento, llegando a un\n" +
"acuerdo.");
                Border border = BorderFactory.createLineBorder(Color.red, 2);
                mensaje.setBounds(722, 400, 210, 118);
                mensaje.setEditable(true);
                mensaje.setBorder(border);
                
                        ImageIcon verMas = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_7.png").getAbsolutePath().toString());
         JLabel plantilla = new JLabel(verMas);
        plantilla.setBounds(674,182,300,400);
        plantilla.setBackground(Color.red);    
        Image imgEscalada4 = verMas.getImage().getScaledInstance(plantilla.getWidth(),
                plantilla.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        plantilla.setIcon(iconoEscalado4);    
                
        

               publiCatalogo.panelVermas1.add(mensaje);
                publiCatalogo.panelVermas1.add(titulo);
                publiCatalogo.panelVermas1.add(marca);
                publiCatalogo.panelVermas1.add(modelo);
                publiCatalogo.panelVermas1.add(matricula);
                publiCatalogo.panelVermas1.add(precio);
                publiCatalogo.panelVermas1.add(fecha_sesion);
                publiCatalogo.panelVermas1.add(plantilla);
            }
            
           public void tazarVehiculo(){
              Connection con = conexion.getConexion();
              PreparedStatement ps = null;
              
                      try {
                   String sql = "insert into vehiculo_usado_venta\n" +
"(marca,modelo,matricula,precio_tasacion,fecha_sesion,id_cliente)\n" +
"values\n" +
"(?,?,?,?,?,?);";
                   ps = con.prepareStatement(sql);
                   ps.setString(1, tv.txtMarcaTasacion.getText());
                   ps.setString(2, tv.txtModeloTasacion.getText());
                    ps.setString(3, tv.txtMatriculaTasacion.getText());
                   ps.setInt(4, Integer.parseInt(tv.txtPrecioTasacion.getText()));
                   String fechaNacimiento = tv.BoxAño.getSelectedItem()+"-"+tv.BoxMes.getSelectedItem()+"-"+tv.boxDia.getSelectedItem();
                   ps.setString(5, fechaNacimiento);
                   ps.setInt(6, cli2.getIdCliente());
                   
                   ps.execute();
                   
               } catch (SQLException e) {
                          System.out.println(e);
               }
           }         
          
    int n2 = 0;
    JSeparator separador = new JSeparator();    
    ImageIcon img3 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\ENCARGARboton.png").getAbsolutePath().toString());
        JLabel etiqueta2 = new JLabel(img3);
        JLabel marca2 = new JLabel();
        JLabel cilindraje = new JLabel(); 
         JLabel precio2 = new JLabel();
         String marcaPublico;
         String modeloPublico;
         ImageIcon img2 = new ImageIcon();
        JLabel etiqueta4 = new JLabel(img2);
        int cilindrajePublico;
        int PrecioPublico;
                                        
        ImageIcon img5 = new ImageIcon( new File("src\\imgDesignVendedor\\carpetaImg\\ENCARGARboton.png").getAbsolutePath().toString());
        JLabel etiqueta5 = new JLabel(img3);
        
        // Con este metodo cuando pulsamos en el boton encargar nos envia al apartado de compra
        public void parametrosCatalogo(String modelo,String marca,int precio,int cc, String descripcion){
        Connection con = conexion.getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        try {
            String sql = "select catalogo.idCatalogo,marca,modelo,cilindraje,precio,matricula,opciones_adicionales.nombre,opciones_adicionales.descripcion from catalogo\n" +
"                        inner join opciones_adicionales\n" +
"                        on catalogo.idCatalogo = opciones_adicionales.idCatalogo where marca = ? and modelo = ? and precio = ? and cilindraje = ? and descripcion = ?";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setInt(3,precio);
            ps.setInt(4, cc);
            ps.setString(5, descripcion);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                n2+=2;
                
                
               
                 //con esto agregamos las publicaciones
        ImageIcon verMas = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_1.png").getAbsolutePath().toString());
         boton = new JLabel(verMas);
        boton.setBounds(657,15*1*12+250,100,30);
        boton.setBackground(Color.red);    
        Image imgEscalada4 = verMas.getImage().getScaledInstance(boton.getWidth(),
                boton.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        boton.setIcon(iconoEscalado4);    
                
                
        img2 = new ImageIcon(rs.getString("opciones_adicionales.nombre"));
       etiqueta4 = new JLabel(img2);
        etiqueta4.setBounds(138,15*1*12,343,218);
        etiqueta4.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta4.getWidth(),
                etiqueta4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta4.setIcon(iconoEscalado2);
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
        etiqueta4.setBorder(blackline);
        
         
                          
        img3 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\ENCARGARboton.png").getAbsolutePath().toString());
        
               
                        
        etiqueta2 = new JLabel(img3);
        etiqueta2.setBounds(548,(15*1*12)+120,101,35);
        etiqueta2.setBackground(Color.red);    
        Image imgEscalada3 = img3.getImage().getScaledInstance(etiqueta2.getWidth(),
                etiqueta2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        etiqueta2.setIcon(iconoEscalado3);
                
          img5 = new ImageIcon(new File("src\\imagenes\\folder\\CederVehiculo.png").getAbsolutePath().toString());
         etiqueta5 = new JLabel(img5);
        etiqueta5.setBounds(548,(15*1*12)+170,101,35);
        etiqueta5.setBackground(Color.red);    
        Image imgEscalada5 = img5.getImage().getScaledInstance(etiqueta5.getWidth(),
                etiqueta5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        etiqueta5.setIcon(iconoEscalado5);
        etiqueta5.addMouseListener(this);
        
        marca2 = new JLabel(rs.getString("catalogo.marca").toUpperCase()+" / "+rs.getString("catalogo.modelo").toUpperCase());
        marca2.setBounds(548,(15*1*12)-50,200,190);
        marca2.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        
        cilindraje = new JLabel(rs.getString("catalogo.cilindraje")+" CC".toUpperCase()+"");
        cilindraje.setBounds(548,(15* 1 *12)-20,200,190);
        cilindraje.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
              
        precio2 = new JLabel(rs.getString("catalogo.precio").toUpperCase()+""+"$");
        precio2.setBounds(548,(15* 1 *12)+8,200,190);
        precio2.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        
        JTextArea textArea = new JTextArea();
        textArea.setText(rs.getString("opciones_adicionales.descripcion"));
        textArea.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        JScrollPane scroll = new JScrollPane(textArea);
        textArea.setEditable(false);
        scroll.setBounds(138,15*1*12+260,500, 120);
        
        
        JPanel panelEmcabezado = new JPanel();
        panelEmcabezado.setBackground(new Color(24,118,208));
        panelEmcabezado.setBounds(1, 1, 968, 157);
          
        JLabel titulo = new JLabel("ENCARGAR AUTO");
        titulo.setBounds(380,45,200,35);
        titulo.setForeground(Color.white);
        titulo.setFont(new Font("ROBOTO BLACK" ,Font.PLAIN,24));
        
                JLabel titulo2 = new JLabel("una vez encargues el auto seras contactado con el vendedor correspondiente.");
        titulo2.setBounds(215,100,600,50);
        titulo2.setForeground(Color.white);
        titulo2.setFont(new Font("ROBOTO MEDIUM" ,Font.PLAIN,15));
        publiCatalogo.panelVermas1.add(titulo2);
        publiCatalogo.panelVermas1.add(titulo);
        
        
         separador = new JSeparator();
        separador.setBounds(5,(15*1*12)+400, 870, 20);
        
        //aqui se agrega todo al panel donde estan las publicaciones
        publiCatalogo.panelVermas1.add(etiqueta5);
        publiCatalogo.panelVermas1.add(panelEmcabezado);
        publiCatalogo.panelVermas1.add(separador);
        publiCatalogo.panelVermas1.add(etiqueta2);
        etiqueta2.addMouseListener(this);
        publiCatalogo.panelVermas1.add(scroll);
        publiCatalogo.panelVermas1.setPreferredSize(new Dimension(900,2000));
        publiCatalogo.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        publiCatalogo.panelVermas1.add(marca2);
        publiCatalogo.panelVermas1.add(cilindraje);
        publiCatalogo.panelVermas1.add(precio2);
        publiCatalogo.panelVermas1.add(etiqueta4);
        
        modeloPublico = rs.getString("catalogo.modelo");
        marcaPublico = rs.getString("catalogo.marca");
        cilindrajePublico = rs.getInt("catalogo.cilindraje");
        PrecioPublico = rs.getInt("catalogo.precio");
                
         publiCatalogo.panelVermas1.setPreferredSize(new Dimension(1000,700*1)); //esto le da el tamaño de las dimensiones del panel
                 publiCatalogo.setVisible(true);
                 
            }
            
        } catch (SQLException e) {
        }
    }
        
    public void Agregar(){
              
        
       JLabel marca = new JLabel("audi");
        marca.setBounds(405,20,90,50);
        marca.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel precio = new JLabel("200.000$");
        precio.setBounds(405,50,90,50);
        precio.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 20));
        
        JLabel modelo = new JLabel(" / r8");
        modelo.setBounds(440,20,90,50);
        modelo.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel cilindraje = new JLabel("600cc");
        cilindraje.setBounds(405,80,90,50);
        cilindraje.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
        ImageIcon img = new ImageIcon("C:\\Users\\57321\\Desktop\\audi-r8-v10-wheelsandmore-1584269172.jpg");
        JLabel etiqueta = new JLabel(img);
        etiqueta.setBounds(145,14,230,203);
        
        
        
        etiqueta.setBackground(Color.red);    
        Image imgEscalada = img.getImage().getScaledInstance(etiqueta.getWidth(),
                etiqueta.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        etiqueta.setIcon(iconoEscalado);
        

                            
        ImageIcon img2 = new ImageIcon("C:\\Users\\57321\\Desktop\\dia2design\\Screenshot_7.png");
        JLabel etiqueta2 = new JLabel(img2);
        etiqueta2.setBounds(110,15,750,211);
        etiqueta2.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta2.getWidth(),
                etiqueta2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta2.setIcon(iconoEscalado2);
              
}
    
    
    
   
       String descripcion3[] = new String[100]; 
       String marca3[] = new String[100]; 
       String modelo3[] = new String[100]; 
       int cilindraje3[] = new int[100];
       int precio3[] = new int[100];
       String matricula3[] = new String[100]; 
       int idCatalogo[] = new int [100];
       int cont = 0;
      
       JLabel botoneliminar[] = new JLabel[100];
       
       public void eliminarmisPublicaciones(String idCatalogo){
           Connection con = conexion.getConexion();
           PreparedStatement ps = null;
           
           try {
            String sql3 = "delete from vendedor_catalogo where idCatalogo = ? and idvendedor = ?";
           String sql = "delete from catalogo where idCatalogo = ?";
           String sql2 = "delete from opciones_adicionales where idCatalogo = ?";
           
           
           ps = con.prepareStatement(sql3);
           ps.setInt(1, Integer.parseInt(idCatalogo));
           ps.setInt(2, cli2.getIdCliente());
           ps.execute();
           
                      ps = con.prepareStatement(sql2);
           ps.setInt(1, Integer.parseInt(idCatalogo));
           ps.execute();
           
           ps = con.prepareStatement(sql);
           ps.setInt(1, Integer.parseInt(idCatalogo));
           ps.execute();
           

           
           } catch (SQLException e) {
               System.out.println(e);
           }
       }
        int n3 = 0;
       public void llenarMispublicaciones(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = "select catalogo.idCatalogo,marca,modelo,cilindraje,precio,matricula,vendedor_catalogo.idvendedor_catalogo,cliente.nombre,cliente.apellido,cliente.telefono,idvendedor_catalogo,cliente.correo,opciones_adicionales.nombre,opciones_adicionales.descripcion,vendedor_catalogo.idvendedor  from catalogo\n" +
"                        inner join vendedor_catalogo\n" +
"                        on catalogo.idCatalogo = vendedor_catalogo.idCatalogo\n" +
"                        inner join cliente\n" +
"                        on vendedor_catalogo.idvendedor = cliente.idcliente\n" +
"                        inner join opciones_adicionales\n" +
"                        on catalogo.idCatalogo = opciones_adicionales.idCatalogo\n" +
"                        where vendedor_catalogo.idvendedor = ?";
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli2.getIdCliente());
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                
                n3+=2;
                
                if(n3 >= 3){
                    n3-=1;
                }
                                                
                //añadimos con este codigo la descripcion del vendedor en la tabla de ver publicaciones
                ImageIcon img5 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\640 162.png").getAbsolutePath().toString());
        JLabel etiqueta5 = new JLabel(img5);
        etiqueta5.setBounds(160,50,630,200);
        etiqueta5.setBackground(Color.red);    
        Image imgEscalada5 = img5.getImage().getScaledInstance(etiqueta5.getWidth(),
                etiqueta5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        etiqueta5.setIcon(iconoEscalado5);
                                                        
        ImageIcon img6 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\descarga.png").getAbsolutePath().toString());
        JLabel etiqueta6 = new JLabel(img6);
        etiqueta6.setBounds(160,50,200,190);
        etiqueta6.setBackground(Color.red);    
        Image imgEscalada6 = img6.getImage().getScaledInstance(etiqueta6.getWidth(),
                etiqueta6.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);
        etiqueta6.setIcon(iconoEscalado6);    
        
                JLabel nombre = new JLabel(rs.getString("cliente.Nombre")+" / "+rs.getString("cliente.apellido"));
        nombre.setBounds(440,25,200,190);
        nombre.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel telefono = new JLabel(rs.getString("cliente.telefono")+"");
        telefono.setBounds(440,75,200,190);
        telefono.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 14));
              
        JLabel correo = new JLabel("correo: "+rs.getString("cliente.correo")+"");
        correo.setBounds(440,50,240,190);
        correo.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
                JSeparator separador1 = new JSeparator();
         separador1.setBounds(5,280, 870, 20);
        
         JPanel panel = new JPanel();
         panel.setBackground(new Color(24,118,208));
         panel.setBounds(10,300,920,100);
         
         JLabel titulo = new JLabel("Mis publicaciones"); //276     /868x48
         titulo.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 22));
         titulo.setBackground(new Color(24,118,208));
         titulo.setForeground(Color.WHITE);
         
         titulo.setBounds(370,300,200,100);
         
                         JSeparator separador2 = new JSeparator();
         separador2.setBounds(5,410, 870, 20);
         prin.jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
         
         
         prin.PanelPublicaciones.add(titulo);
         prin.PanelPublicaciones.add(panel);
        prin.PanelPublicaciones.add(correo);
        prin.PanelPublicaciones.add(nombre);
        prin.PanelPublicaciones.add(telefono);
        prin.PanelPublicaciones.add(etiqueta6);
        prin.PanelPublicaciones.add(etiqueta5);
                
                
                
                
                
                 JLabel marca = new JLabel(rs.getString("marca")+" / "+rs.getString("modelo"));
        marca.setBounds(405,(15*n3*15),200,50);
        marca.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel precio = new JLabel(rs.getInt("precio")+"");
        precio.setBounds(405,15*n3*15+30,110,50);
        precio.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 20));
              
        JLabel cilindraje = new JLabel(rs.getInt("cilindraje")+""+"cc");
        cilindraje.setBounds(405,15*n3*15+60,90,50);
        cilindraje.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
        ImageIcon img = new ImageIcon(rs.getString("opciones_adicionales.nombre"));
        JLabel etiqueta = new JLabel(img);
        etiqueta.setBounds(145,15*n3*15,230,203);
        
        JLabel descripcion = new JLabel(rs.getString("descripcion"));
        descripcion.setBounds(405,15*n3*15+90,250,50);
        descripcion.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 14));
        
        etiqueta.setBackground(Color.red);    
        Image imgEscalada = img.getImage().getScaledInstance(etiqueta.getWidth(),
                etiqueta.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        etiqueta.setIcon(iconoEscalado);
        
        prin.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

                                       
        ImageIcon img2 = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_7.png").getAbsolutePath().toString());
        JLabel etiqueta2 = new JLabel(img2);
        etiqueta2.setBounds(110,15*n3*15,750,211);
        etiqueta2.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta2.getWidth(),
                etiqueta2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta2.setIcon(iconoEscalado2);
                                    
                                                    
                ImageIcon img3 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\editarBoton.png").getAbsolutePath().toString());
        JLabel etiqueta7 = new JLabel(img3);
        etiqueta7.setBounds(560,(15*(n3*15)+35)+120,101,35);
        etiqueta7.setBackground(Color.red);    
        Image imgEscalada3 = img3.getImage().getScaledInstance(etiqueta7.getWidth(),
                etiqueta7.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        etiqueta7.setIcon(iconoEscalado3);
                       
        ImageIcon img8 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\btnEliminar.png").getAbsolutePath().toString());
        JLabel etiqueta8 = new JLabel(img8);
        etiqueta8.setBounds(680,(15*(n3*15)+35)+120,101,35);
        etiqueta8.setBackground(Color.red);    
        Image imgEscalada8 = img8.getImage().getScaledInstance(etiqueta8.getWidth(),
                etiqueta8.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado8 = new ImageIcon(imgEscalada8);
        etiqueta8.setIcon(iconoEscalado8);
       
        cont +=1;
        botoneliminar[cont]= new JLabel();
            botoneliminar[cont].setBounds(680,(15*(n3*15)+35)+120,101,35);
            botoneliminar[cont].addMouseListener(this);
            botoneliminar[cont].setName(cont+"");
             
            botoneliminar[cont].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
                prin.PanelPublicaciones.add(botoneliminar[cont]);
        
        
                    etiquetaMisplublicaciones[cont]= new JLabel();
            etiquetaMisplublicaciones[cont].setBounds(560,(15*(n3*15)+35)+120,101,35);
            etiquetaMisplublicaciones[cont].addMouseListener(this);
            etiquetaMisplublicaciones[cont].setName(cont+"");
             
            etiquetaMisplublicaciones[cont].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
                prin.PanelPublicaciones.add(etiquetaMisplublicaciones[cont]);
        
                   
                System.out.println(n3+" n3");

       idCatalogo[cont] = rs.getInt("idCatalogo");
       descripcion3[cont] = rs.getString("descripcion");
       marca3[cont] = rs.getString("marca");
       modelo3[cont] = rs.getString("modelo");
        cilindraje3[cont] = rs.getInt("cilindraje");
        precio3[cont] = rs.getInt("precio");
       matricula3[cont] = rs.getString("matricula");
        
       prin.PanelPublicaciones.add(etiqueta8);
       prin.PanelPublicaciones.add(etiqueta7);
        prin.PanelPublicaciones.add(descripcion);
        prin.PanelPublicaciones.add(marca);
        prin.PanelPublicaciones.add(precio);
       
        prin.PanelPublicaciones.add(cilindraje);
        prin.PanelPublicaciones.add(precio);
        prin.PanelPublicaciones.add(etiqueta);
        prin.PanelPublicaciones.add(etiqueta2);
        
               
        prin.PanelPublicaciones.setPreferredSize(new Dimension(1000,1000*idcount())); //multiplico 250+idcatalogo para que las dimensiones se acomoden a la cantidad de articulos
                
            }
            n3 = 0;
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
       
       
        JLabel etiqueta6 = new JLabel();
        
                String marca4; 
        String modelo4 ;
        String cilindraje4 ;
        String Descripcion4 ;
        String precio4 ;
        String matricula4;
    
        public void llenarActualizarMisPublicaciones(String marca5,String modelo5, int cilindraje5, int precio5,String matricula5){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String sql = " select marca,modelo,cilindraje,precio,matricula,nombre,nombre2,descripcion\n" +
" from catalogo\n" +
" inner join opciones_adicionales\n" +
" on catalogo.idCatalogo = opciones_adicionales.idCatalogo\n" +
" where marca = ? and modelo = ? and cilindraje = ? and  precio = ? and matricula = ?";
            ps = con.prepareStatement(sql);
           
            
            ps.setString(1, marca5);
            ps.setString(2, modelo5);
            ps.setInt(3, cilindraje5);
            ps.setInt(4, precio5);
            ps.setString(5, matricula5);
            
            rs = ps.executeQuery();
            while(rs.next()){
               editpubli.txtMarca.setText(rs.getString("marca"));
               editpubli.txtCilindraje.setText(rs.getString("cilindraje"));
               editpubli.txtDescripcion.setText(rs.getString("descripcion"));
               editpubli.txtMatricula.setText(rs.getString("matricula"));
               editpubli.txtModelo.setText(rs.getString("modelo"));
               editpubli.txtPrecio.setText(rs.getString("precio"));
               editpubli.txtFotoEdit.setText(rs.getString("nombre2"));
              
                       
               editpubli.txtMarca.setEditable(false);
               editpubli.txtCilindraje.setEditable(false);
               editpubli.txtDescripcion.setEditable(false);
               editpubli.txtMatricula.setEditable(false);
               editpubli.txtModelo.setEditable(false);
               editpubli.txtPrecio.setEditable(false);
                
               
               ImageIcon img2 = new ImageIcon(rs.getString("nombre"));
        editpubli.imagenActualizar.setIcon(img2);
        editpubli.imagenActualizar.setBounds(110,70,300,250);
        
        
        Image imgEscalada2 = img2.getImage().getScaledInstance(editpubli.imagenActualizar.getWidth(),
                editpubli.imagenActualizar.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        editpubli.imagenActualizar.setIcon(iconoEscalado2);
              
         marca4 = editpubli.txtMarca.getText();
         modelo4 = editpubli.txtModelo.getText();
         cilindraje4 = editpubli.txtCilindraje.getText();
         Descripcion4 = editpubli.txtDescripcion.getText();
         precio4 = editpubli.txtPrecio.getText();
        
         matricula4 = editpubli.txtMatricula.getText();
         
         Border blackline = BorderFactory.createLineBorder(Color.black);
         editpubli.imagenActualizar.setBorder(blackline);
                editpubli.panelEditpubli.add(editpubli.imagenActualizar);
           editpubli.setVisible(true);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    //con este metodo podemos actualizar nuestras propias publicaciones 
    public void actualizarMisPlublicaciones(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        
        try {
            String sql ="update catalogo \n" +
"inner join opciones_adicionales\n" +
"on catalogo.idCatalogo = opciones_adicionales.idCatalogo\n" +
" set marca = ?, modelo = ?, cilindraje = ?, precio =  ?,matricula  =? , descripcion = ?, nombre = ?\n" +
" where marca = ? and modelo = ? and cilindraje = ? and precio = ? and matricula = ?;";

         
            ps = con.prepareStatement(sql);
            
            ImageIcon nombre = new ImageIcon(new File("src\\imagenesbd\\carpetaImg\\"+editpubli.txtFotoEdit.getText()).getAbsolutePath().toString());
            cat.setNombre(nombre.toString());
            
            ps.setString(1,editpubli.txtMarca.getText());
            ps.setString(2,editpubli.txtModelo.getText());
            ps.setInt(3,Integer.parseInt(editpubli.txtCilindraje.getText()));
            ps.setInt(4,Integer.parseInt(editpubli.txtPrecio.getText())); 
            ps.setString(5,editpubli.txtMatricula.getText());
            ps.setString(6,editpubli.txtDescripcion.getText());
            ps.setString(7, nombre.toString());
            
            
            ps.setString(8, marca4);
            ps.setString(9, modelo4);
            ps.setInt(10, Integer.parseInt(cilindraje4));
            ps.setDouble(11, Double.parseDouble(precio4));
            ps.setString(12, matricula4);
            
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "actualizado con exito");
            
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error al actualizar, revise los datos");
        }
    }
    
    // con esta pestaña podemos ver las publicaciones del vendedor que seleccionamos con el boton de (ver publicaciones)
    //basicamente agregamos en primera instancia los datos del vendedor en el encabezado y luego agregamos sus publicaciones.
    public void verPublicaciones(int idvendedor){
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = conexion.getConexion();
        try {
            String sql ="select catalogo.idCatalogo,marca,modelo,cilindraje,precio,matricula,vendedor_catalogo.idvendedor_catalogo,cliente.nombre,cliente.apellido,cliente.telefono,idvendedor_catalogo,cliente.correo,opciones_adicionales.nombre,opciones_adicionales.descripcion,vendedor_catalogo.idvendedor  from catalogo\n" +
"                        inner join vendedor_catalogo\n" +
"                        on catalogo.idCatalogo = vendedor_catalogo.idCatalogo\n" +
"                        inner join cliente\n" +
"                        on vendedor_catalogo.idvendedor = cliente.idcliente\n" +
"                        inner join opciones_adicionales\n" +
"                        on catalogo.idCatalogo = opciones_adicionales.idCatalogo\n" +
"                        where vendedor_catalogo.idvendedor = ?";
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idvendedor);
            rs = ps.executeQuery();
            
            while(rs.next()){
                n+=2;
                System.out.println(n+" fafasf");
                                               
                //añadimos con este codigo la descripcion del vendedor en la tabla de ver publicaciones
                ImageIcon img5 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\640 162.png").getAbsolutePath().toString());
        JLabel etiqueta5 = new JLabel(img5);
        etiqueta5.setBounds(160,50,630,200);
        etiqueta5.setBackground(Color.red);    
        Image imgEscalada5 = img5.getImage().getScaledInstance(etiqueta5.getWidth(),
                etiqueta5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
        etiqueta5.setIcon(iconoEscalado5);
                                              
                                
        ImageIcon img6 = new ImageIcon( new File("src\\imgDesignVendedor\\carpetaImg\\descarga.png").getAbsolutePath().toString());
        JLabel etiqueta6 = new JLabel(img6);
        etiqueta6.setBounds(160,50,200,190);
        etiqueta6.setBackground(Color.red);    
        Image imgEscalada6 = img6.getImage().getScaledInstance(etiqueta6.getWidth(),
                etiqueta6.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado6 = new ImageIcon(imgEscalada6);
        etiqueta6.setIcon(iconoEscalado6);    
        
                JLabel nombre = new JLabel(rs.getString("cliente.Nombre")+" / "+rs.getString("cliente.apellido"));
        nombre.setBounds(440,25,200,190);
        nombre.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel telefono = new JLabel(rs.getString("cliente.telefono")+"");
        telefono.setBounds(440,75,200,190);
        telefono.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 14));
              
        JLabel correo = new JLabel("correo: "+rs.getString("cliente.correo")+"");
        correo.setBounds(440,50,240,190);
        correo.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
                JSeparator separador1 = new JSeparator();
         separador1.setBounds(5,280, 870, 20);
        
         JPanel panel = new JPanel();
         panel.setBackground(new Color(24,118,208));
         panel.setBounds(10,300,868,100);
         
         JLabel titulo = new JLabel("publicaciones"); //276     /868x48
         titulo.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 22));
         titulo.setBackground(new Color(24,118,208));
         titulo.setForeground(Color.WHITE);
         
         titulo.setBounds(370,300,200,100);
         
                         JSeparator separador2 = new JSeparator();
         separador2.setBounds(5,410, 870, 20);
         
         
         
         publi.panelVermas.add(titulo);
         publi.panelVermas.add(panel);
        publi.panelVermas.add(correo);
        publi.panelVermas.add(nombre);
        publi.panelVermas.add(telefono);
        publi.panelVermas.add(etiqueta6);
        publi.panelVermas.add(etiqueta5);
      //---------------------------------------------------------------------------------------------------------------- 
         
      //con esto agregamos las publicaciones
        ImageIcon verMas = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_1.png").getAbsolutePath().toString());
         boton = new JLabel(verMas);
        boton.setBounds(657,(15*n*15)+250,100,30);
        boton.setBackground(Color.red);    
        Image imgEscalada4 = verMas.getImage().getScaledInstance(boton.getWidth(),
                boton.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        boton.setIcon(iconoEscalado4);    
                
                
               ImageIcon img2 = new ImageIcon(rs.getString("opciones_adicionales.nombre"));
        JLabel etiqueta4 = new JLabel(img2);
        etiqueta4.setBounds(138,15*n*15,343,218);
        etiqueta4.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta4.getWidth(),
                etiqueta4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta4.setIcon(iconoEscalado2);
        
        Border blackline = BorderFactory.createLineBorder(Color.black);
        etiqueta4.setBorder(blackline);
        
                                                   
                ImageIcon img3 = new ImageIcon( new File("src\\imgDesignVendedor\\carpetaImg\\ENCARGARboton.png").getAbsolutePath().toString());
        JLabel etiqueta2 = new JLabel(img3);
        etiqueta2.setBounds(548,(15*n*15)+120,101,35);
        etiqueta2.setBackground(Color.red);    
        Image imgEscalada3 = img3.getImage().getScaledInstance(etiqueta2.getWidth(),
                etiqueta2.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        etiqueta2.setIcon(iconoEscalado3);
        
        JLabel marca = new JLabel(rs.getString("catalogo.marca").toUpperCase()+" / "+rs.getString("catalogo.modelo").toUpperCase());
        marca.setBounds(548,(15*n*15)-50,200,190);
        marca.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        
        JLabel cilindraje = new JLabel(rs.getString("catalogo.cilindraje")+" CC".toUpperCase()+"");
        cilindraje.setBounds(548,15* n *15,200,190);
        cilindraje.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
              
        JLabel precio = new JLabel(rs.getString("catalogo.precio").toUpperCase()+"");
        precio.setBounds(548,15*n*15+80,240,190);
        precio.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        
        JTextArea textArea = new JTextArea();
        textArea.setText(rs.getString("opciones_adicionales.descripcion"));
        textArea.setFont(new Font("ROBOTO MEDIUM", Font.BOLD, 14));
        JScrollPane scroll = new JScrollPane(textArea);
        textArea.setEditable(false);
        scroll.setBounds(138,15*n*15+260,607, 120);
                System.out.println(n+" esta es la n");
        JSeparator separador = new JSeparator();
        separador.setBounds(5,(15*n*15)+400, 870, 20);
        
        //aqui se agrega todo al panel donde estan las publicaciones
        publi.panelVermas.add(separador);
        publi.panelVermas.add(etiqueta2);
        publi.panelVermas.add(scroll);
        publi.panelVermas.setPreferredSize(new Dimension(900,2000));
        publi.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        publi.panelVermas.add(marca);
        publi.panelVermas.add(cilindraje);
        publi.panelVermas.add(precio);
        publi.panelVermas.add(etiqueta4);
        

        publi.panelVermas.setPreferredSize(new Dimension(1000,1000*countIDVendedores(rs.getInt("vendedor_catalogo.idvendedor")))); //esto le da el tamaño de las dimensiones del panel
         
        publi.setVisible(true);
         
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
      n = 0;
    }
      public void JScrollPaneSample() {
       
 
        
    }

    public int countIDVendedores(int n1){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null; 
        int n = 0;
        try {
            String sql = "select count(idvendedor) from vendedor_catalogo where idvendedor = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, n1);
            rs = ps.executeQuery();
            
            if(rs.next()){
                n = rs.getInt(1);
                return n;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
         return n;       
    }
    // con este metodo determinamos cuantos vendedores existen en la empresa, y podemos dimensionar la pestaña correspondiente a vendedores
    public int countIDVendedores1(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null; 
        int n = 0;
        try {
            String sql = "select count(idvendedor_catalogo) from vendedor_catalogo";
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                n = rs.getInt(1);
                return n;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
         return n;       
    }
    
    // con este metodo podemos añadir ventas al catalogo.
    public void añadirVenta(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            String sql = "select catalogo.idcatalogo,idvendedor,modelo,marca,cilindraje,precio,matricula from catalogo\n" +
"inner join vendedor_catalogo\n" +
"on catalogo.idcatalogo = vendedor_catalogo.idcatalogo\n" +
"where modelo = ? and marca = ? and cilindraje = ? and precio = ?";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, modeloPublico);
            ps.setString(2, marcaPublico);
            ps.setInt(3, cilindrajePublico);
            ps.setInt(4, PrecioPublico);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                String sql2 = "insert into ventas\n" +
                    "(idcliente,idvendedor,idcatalogo,precio)\n" +
                    "values\n" +
                    "(?,?,?,?)";
            ps = con.prepareStatement(sql2);
            ps.setInt(1, cli2.getIdCliente());
            ps.setInt(2, rs.getInt(2));
            ps.setInt(3, rs.getInt(1));
            ps.setInt(4, rs.getInt("precio"));
            ps.execute();
            JOptionPane.showMessageDialog(null, "pedido realizado correctamente");
            }
                    
                    
            //ps.setString(1, publiCatalogo.panelVermas1.);
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void añadirVentaConVehiculoTazado(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            
            String sql = "select catalogo.idcatalogo,idvendedor,modelo,marca,cilindraje,precio,matricula from catalogo\n" +
"inner join vendedor_catalogo\n" +
"on catalogo.idcatalogo = vendedor_catalogo.idcatalogo\n" +
"where modelo = ? and marca = ? and cilindraje = ? and precio = ?";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, modeloPublico);
            ps.setString(2, marcaPublico);
            ps.setInt(3, cilindrajePublico);
            ps.setInt(4, PrecioPublico);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                String sql2 = "insert into ventas\n" +
                    "(idcliente,idvendedor,idcatalogo,precio)\n" +
                    "values\n" +
                    "(?,?,?,?)";
            ps = con.prepareStatement(sql2);
            ps.setInt(1, cli2.getIdCliente());
            ps.setInt(2, rs.getInt(2));
            ps.setInt(3, rs.getInt(1));
            ps.setInt(4, rs.getInt("precio"));
            ps.execute();
            JOptionPane.showMessageDialog(null, "pedido realizado correctamente");
            
            String sql3 = "insert into vehiculo_usado_venta \n" +
"(marca,modelo,matricula,precio_tasacion,fecha_Sesion,id_cliente)\n" +
"values\n" +
"(?,?,?,?,?,?);";
            ps = con.prepareStatement(sql3);
            ps.setString(1,  vc.getMarca());
            ps.setString(2, vc.getModelo());
            ps.setString(3, vc.getMatricula());
            ps.setInt(4, vc.getPrecio());
            ps.setString(5, vc.getFecha_sesion());
            ps.setInt(6, vc.getId_cliente());
            ps.execute();
            }
                    
                    
            //ps.setString(1, publiCatalogo.panelVermas1.);
            
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    //con este metodo podemos eliminar nuestra cuenta en el apartado de configuracion.
    public void eliminarCuenta(){
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
       
        try {
            String sql = "delete from cliente where idCliente = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli2.getIdCliente());
            ps.execute();
            JOptionPane.showMessageDialog(null, "cuenta eliminada con exito");
             System.exit(0);
        } catch (SQLException e) {
        }
    }
    
    // en este metodo basicamente estamos agregando los vendedores a la pestaña de vendedores, aqui se pueden ver.
    public void agregarVendedores(){
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = conexion.getConexion();
        int n = 0;
        try {
            String sql = "select distinct nombre,apellido,telefono,correo,cliente.idcliente\n" +
"from cliente\n" +
"inner join tipo_usuario\n" +
"on cliente.idcliente = tipo_usuario.idcliente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                n++;
              
                
                       
                        
                                
                                ImageIcon img2 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\640 162.png").getAbsolutePath().toString());
        JLabel etiqueta4 = new JLabel(img2);
        etiqueta4.setBounds(160,(15*n*15)+100,630,200);
        etiqueta4.setBackground(Color.red);    
        Image imgEscalada2 = img2.getImage().getScaledInstance(etiqueta4.getWidth(),
                etiqueta4.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
        etiqueta4.setIcon(iconoEscalado2);
                
                                    
        ImageIcon img3 = new ImageIcon(new File("src\\imgDesignVendedor\\carpetaImg\\descarga.png").getAbsolutePath().toString());
        JLabel etiqueta3 = new JLabel(img3);
        etiqueta3.setBounds(160,(15*n*15)+100,200,190);
        etiqueta3.setBackground(Color.red);    
        Image imgEscalada3 = img3.getImage().getScaledInstance(etiqueta3.getWidth(),
                etiqueta3.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
        etiqueta3.setIcon(iconoEscalado3);    
        
                JLabel nombre = new JLabel(rs.getString("cliente.Nombre")+" / "+rs.getString("cliente.apellido"));
        nombre.setBounds(440,(15*n*15)+50,200,190);
        nombre.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 18));
        
        JLabel telefono = new JLabel(rs.getString("cliente.telefono")+"");
        telefono.setBounds(440,(15*n*15)+70,200,190);
        telefono.setFont(new Font("ROBOTO BLACK", Font.PLAIN, 14));
              
        JLabel correo = new JLabel("correo: "+rs.getString("cliente.correo")+"");
        correo.setBounds(440,(15*n*15)+100,240,190);
        correo.setFont(new Font("ROBOTO MEDIUM", Font.PLAIN, 15));
        
      
                                        
        ImageIcon verMas = new ImageIcon(new File("src\\imgDesignCatalogo\\carpetaImg\\Screenshot_1.png").getAbsolutePath().toString());
         boton = new JLabel(verMas);
        boton.setBounds(657,(15*n*15)+250,100,30);
        boton.setBackground(Color.red);    
        Image imgEscalada4 = verMas.getImage().getScaledInstance(boton.getWidth(),
                boton.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
        boton.setIcon(iconoEscalado4);    
              

               
            etiqueta[n]= new JLabel();
            etiqueta[n].setBounds(657,(15*n*15)+250,100,30);
            etiqueta[n].addMouseListener(this);
            etiqueta[n].setName(rs.getInt("cliente.idcliente")+"");
            etiqueta[n].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
                prin.panelVendedor3.add(etiqueta[n]);
                
                prin.jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        
        
                prin.panelVendedor3.add(boton);
                prin.panelVendedor3.add(nombre);
                prin.panelVendedor3.add(telefono);
                prin.panelVendedor3.add(correo);
                prin.panelVendedor3.add(etiqueta3);
                prin.panelVendedor3.add(etiqueta4);

                  prin.panelVendedor3.setPreferredSize(new Dimension(1000,8000*countIDVendedores1()));
                
            
        } }catch (SQLException e) {
            System.out.println(e);
              
        }
    
    }
}
