
package modelo;

import java.sql.*;
import vista.principal;
public class Consultas extends Conexion{
    Cliente2 cli = Cliente2.getInstance();
    int idcliente;
    public boolean registrar(Cliente cliente){
        Connection con = getConexion();
        PreparedStatement ps = null;
        try {
            String sql = "insert into cliente(nombre,apellido,correo,dni,telefono,direccion,password,fecha_nacimiento) values (?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.nombre);
            ps.setString(2, cliente.apellido);
            ps.setString(3, cliente.correo);
            ps.setString(4, cliente.dni);
            ps.setString(5, cliente.telefono);
            ps.setString(6, cliente.direccion);
            ps.setString(7, cliente.contraseña);
            ps.setString(8, cliente.fecha_nacimiento);
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
 
    }
    public int encontrar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs;
        try {
            String sql = "select count(id) from cliente where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
                
            }
        } catch (SQLException e) {
            return 1;
        }
        return 1;
    }
   public boolean editarUsuario(Cliente client){
       Connection con =getConexion();
       PreparedStatement ps = null;
      
       
       try {
           String sql = "update cliente set nombre = ?, apellido = ?, correo = ?, dni = ?, telefono = ?,direccion = ?  where idCliente = ?";
           
           ps = con.prepareStatement(sql);
           ps.setString(1, client.getNombre());
           ps.setString(2, client.getApellido());
           ps.setString(3, client.getCorreo());
           ps.setString(4, client.getDni());
           ps.setString(5, client.getTelefono());
           ps.setString(6, client.getDireccion());
           ps.setInt(7, cli.getIdCliente());
           System.out.println(cli.getIdCliente()+"id cliente usado");
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
   } 
   
   public boolean editarUsuariocontraseña(Cliente client){
       Connection con =getConexion();
       PreparedStatement ps = null;
      
       
       try {
           String sql = "update cliente set password = ?  where idCliente = ?";
           
           ps = con.prepareStatement(sql);

           ps.setString(1, client.getContraseña());
           ps.setInt(2, cli.getIdCliente());
          
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
   } 
   public boolean Iniciar(Cliente cliente){
       PreparedStatement ps = null;
       Connection con = getConexion();
       ResultSet rs;
       try {
           String sql = "select idCliente,nombre,apellido,correo,password,dni,telefono,direccion from cliente where correo = ? and password = ?";
           ps = con.prepareStatement(sql);
           ps.setString(1, cliente.getCorreo());
           ps.setString(2, cliente.getContraseña());
           
           rs = ps.executeQuery();
           while(rs.next()){
               
               
               if(cliente.getContraseña().equals(rs.getString(5)) ){
               cliente.setIdCliente(rs.getInt("idCliente"));
               cliente.setNombre(rs.getString("nombre"));
               cliente.setApellido(rs.getString("apellido"));
               cliente.setCorreo(rs.getString("correo"));
               cliente.setDni(rs.getString("password"));
               cliente.setTelefono(rs.getString("dni"));
               cliente.setDireccion(rs.getString("telefono"));
               cliente.setContraseña(rs.getString("direccion"));
               
               cli.setIdCliente(rs.getInt("idCliente"));
               cli.setNombre(rs.getString("nombre"));
               cli.setApellido(rs.getString("apellido"));
               cli.setCorreo(rs.getString("correo"));
               cli.setDni(rs.getString("dni"));
               cli.setTelefono(rs.getString("telefono"));
               cli.setDireccion(rs.getString("direccion"));
               cli.setContraseña(rs.getString("password"));
               
               return true;
               }
               
           }
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
       return false;
   }
   
   public boolean insertarCatalogo(Catalogo cat){
       Connection con = getConexion();
       PreparedStatement ps = null;
       
       try {
       String sql = "insert into catalogo(marca,modelo,cilindraje,precio) values(?,?,?,?)";  
       ps = con.prepareStatement(sql);
       ps.setString(1, cat.getMarca());
       ps.setString(2, cat.getModelo());
       ps.setInt(3, cat.getCilindrage());
       ps.setInt(4, cat.getPrecio());
       
       ps.execute();
       return true;
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
       
   }
   
   
   public boolean inicio_vendedor(Cliente cli){
       Connection con = getConexion();
       PreparedStatement ps  = null;
       ResultSet rs = null;
       try {
           String sql = "select cliente.idCliente, cliente.nombre, tipo_usuario.cliente, tipo_usuario.vendedor,cliente.password,cliente.correo from cliente  inner join tipo_usuario  on cliente.idCliente = tipo_usuario.idCliente where cliente.correo = ? and cliente.password = ?";
                        
                      ps = con.prepareStatement(sql);
                      ps.setString(1, cli.getCorreo());
                      ps.setString(2, cli.getContraseña());
                      rs = ps.executeQuery();
                      
                      while(rs.next()){
                        return true;
                     
                         
                          
                          
                      }
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
       return false;
   }
   
   public boolean AgregarCatalogo(Catalogo cat){
       Connection con = getConexion();
       PreparedStatement ps = null;
       ResultSet rs;
       
       try {
       String sql = "insert into catalogo(marca,modelo,cilindraje,precio,matricula) values (?,?,?,?,?)";
      
       
       
       ps = con.prepareStatement(sql);
       ps.setString(1, cat.getMarca());
       ps.setString(2, cat.getModelo());
       ps.setInt(3, cat.getCilindrage());
       ps.setInt(4, cat.getPrecio());
       ps.setString(5, cat.getMatricula());
       ps.execute();
       
       
       String sql3 = "select idcatalogo from catalogo where marca = ? and modelo = ? and cilindraje = ? and precio = ? and matricula = ?;";
       ps = con.prepareStatement(sql3);
       ps.setString(1, cat.getMarca());
       ps.setString(2, cat.getModelo());
       ps.setInt(3, cat.getCilindrage());
       ps.setInt(4, cat.getPrecio());
       ps.setString(5, cat.getMatricula());
       rs = ps.executeQuery();
       
       while(rs.next()){
          int id =  rs.getInt("idcatalogo");
           
           
           String sql2 = "insert into opciones_adicionales (nombre,descripcion,idCatalogo,nombre2) values (?,?,?,?)";
       
       ps = con.prepareStatement(sql2);
       ps.setString(1, cat.getNombre());
       ps.setString(2, cat.getDescripcion());
       ps.setInt(3, id);
       ps.setString(4, cat.getNombre2());
       ps.execute();
       
       
       String sql4 = "insert into vendedor_catalogo\n" +
"(idvendedor,idCatalogo)\n" +
"values\n" +
"(?,?);";
       
       ps = con.prepareStatement(sql4);
       ps.setInt(1, cli.getIdCliente());
       ps.setInt(2, rs.getInt("idCatalogo"));
       ps.execute();
       }
       
       
    
       
       return true;
       } catch (SQLException e) {
           System.out.println(e);
           return false;
       }
       
   }
   
   
   
}
