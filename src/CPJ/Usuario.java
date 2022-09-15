package CPJ;

import java.util.Date;

public class Usuario {
    private int ID;
    private String nombreCompleto;
    private int Rut;
    private String DV;
    private Date fechaNac;
    private int Telefono;
    private String nombreUsuario;
    private String Email;
    private String Contraseña;
    private int Edad;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if(Edad>=18){
            this.Edad = Edad;
        }
    }
    
    public Usuario(){
        this.ID = -1;
        this.nombreUsuario = "Sin asignar";
        this.Rut = -1;
        this.DV = "";
        this.Email = "No se ha añadido";
        this.Contraseña = "No se ha creado";
        this.nombreCompleto = "Sin asignar";
        this.Telefono = -1;
        this.fechaNac = new Date();
        this.Edad = -1;
    }
    
    public Usuario(int Rut, String DV, String nombreCompleto, String Email, Date fechaNac, int Telefono, String nombreUsuario, String Contraseña) {
        this.Rut = Rut;
        this.DV = DV;
        this.nombreCompleto = nombreCompleto;
        this.Email = Email;
        this.fechaNac = fechaNac;
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if(nombreUsuario.length() > 4){
            this.nombreUsuario = nombreUsuario;
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@") && Email.contains(".com") || Email.contains(".cl")){
            this.Email = Email;
        }
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;  
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDV() {
        return DV;
    }

    public void setDV(String DV) {
        this.DV = DV;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        this.Telefono = telefono;       
    }
    public boolean validarRut(int Rut, char DV) {
    boolean validacion = false;
    try {
        int m = 0, s = 1;
        for (; Rut != 0; Rut /= 10) {
            s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
        }
        if (DV == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

    } catch (java.lang.NumberFormatException e) {
    } catch (Exception e) {
    }
    return validacion;
    }
    
}
