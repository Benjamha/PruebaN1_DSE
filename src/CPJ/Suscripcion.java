package CPJ;

public class Suscripcion {
    private int Numero;
    private String Usuario;
    private int abonoTotal;
    private String Equipos;
    
    public Suscripcion(){
        this.Numero = 0;
        this.Usuario = "";
        this.abonoTotal = 0;
        this.Equipos = "";
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getAbonoTotal() {
        return abonoTotal;
    }

    public void setAbonoTotal(int abonoTotal) {
        this.abonoTotal = abonoTotal;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
}
