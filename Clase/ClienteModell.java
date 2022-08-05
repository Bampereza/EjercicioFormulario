/*
 <!-Brandon Isaías Ampérez Aldana 0909-21-4628 -->
 */
package Clase;

/**
 *
 * @author brand
 */
public class ClienteModell {
    
    private String codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String numero;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public ClienteModell(){
    
    this.nombre="Alumno de ejemplo";
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}

