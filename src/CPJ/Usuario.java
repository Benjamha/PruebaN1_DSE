package CPJ;

public class Usuario {
    private int ID;
    private String nombreUsuario;
    private String Email;
    private String Contraseña;
    
    public Usuario(){
        this.ID = 0;
        this.nombreUsuario = "";
        this.Email = "";
        this.Contraseña = "";
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
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
