package CPJ;

import java.util.Date;

public class Suscripcion {
    private int Numero;
    private String Usuarios;
    private int abonoTotal;
    private String Equipos;
    private Date fechaInicio;
    private Usuario Usuario;
    
    public Suscripcion(){
        this.Numero = 0;
        this.Usuarios = "";
        this.abonoTotal = 0;
        this.Equipos = "";
        this.Usuario = new Usuario();
        this.fechaInicio = new Date();
    }

    public Suscripcion(int Numero, String Usuarios, int abonoTotal, String Equipos, Date fechaInicio, Usuario Usuario) {
        this.Numero = Numero;
        this.Usuarios = Usuarios;
        this.abonoTotal = abonoTotal;
        this.Equipos = Equipos;
        this.fechaInicio = fechaInicio;
        this.Usuario = Usuario;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String Usuarios) {
        this.Usuarios = Usuarios;
    }
    
    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void agregarProducto(Club c){
        if(!this.Equipos.equals("")){
            this.Equipos += "; ";
        }
        this.Equipos += c.toString();
        this.abonoTotal += c.getValorSub();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Subscripcion Numero: ");
        sb.append(this.Numero);
        sb.append("\nTotal: $");
        sb.append(this.abonoTotal);
        sb.append("Usuario: ");
        sb.append(this.Usuario.getNombreUsuario());
        sb.append("\n============\n");
        sb.append(this.Equipos);
        
        return sb.toString();
    }
}
