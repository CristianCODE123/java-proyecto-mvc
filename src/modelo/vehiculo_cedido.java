
package modelo;


public class vehiculo_cedido {
    private static vehiculo_cedido vc;
    int id_vehiculo = 0;
    String marca;
    String modelo;
    String matricula;
    int precio;
    String fecha_sesion;
    int id_cliente;

    public static vehiculo_cedido getInstance(){
        if(vc == null){
            vc = new  vehiculo_cedido();
        }
        
        return vc;
    }
    
    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha_sesion() {
        return fecha_sesion;
    }

    public void setFecha_sesion(String fecha_sesion) {
        this.fecha_sesion = fecha_sesion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
