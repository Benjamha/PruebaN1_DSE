package CPJ;

public class Club {
    private int Codigo;
    private String Nombre;
    private String Lema;
    private int valorSub;
    private String Colores;
    
    public Club(){
        this.Codigo = 0;
        this.Nombre = "";
        this.Lema = "";
        this.valorSub = 0;
        this.Colores = "";
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValorSub() {
        return valorSub;
    }

    public void setValorSub(int valorSub) {
        this.valorSub = valorSub;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
    
}
