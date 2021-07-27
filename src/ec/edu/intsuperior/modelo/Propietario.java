
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USER
 */
public class Propietario {
    private String ci;
    private String nombre1;
    private String nombre2;
    private String apellidos1;
    private String apellido2;
    private String direccion;
    private String telefono;

    public Propietario() {
    }

    public Propietario(String ci, String nombre1, String nombre2, String apellidos1, String apellido2, String direccion, String telefono) {
        this.ci = ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidos1 = apellidos1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public void setCi(String ci){
        this.ci=ci;
    }
    
    public String getCi(){
        return ci;
    }

    public String getNombres1() {
        return nombre1;
    }

    public void setNombres1(String nombres1) {
        this.nombre1 = nombres1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
