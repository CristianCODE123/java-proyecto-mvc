
package modelo;


public class Cliente2 {
    
    private static Cliente2 cli;
        private int idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private String dni;
    private String telefono;
    private String direccion;
    private String contraseña;
    private String fecha_nacimiento;
    private int tipo_cliente;
    
    private Cliente2(){
        
    }
    
    public static Cliente2 getInstance(){
        if(cli == null){
            cli = new  Cliente2();
        }
        
        return cli;
    }

    public static Cliente2 getCli() {
        return cli;
    }

    public static void setCli(Cliente2 cli) {
        Cliente2.cli = cli;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(int tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }
            
}
