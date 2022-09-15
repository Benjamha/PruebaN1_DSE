package CPJ;

public class Club {
    private String Codigo;
    private String Nombre;
    private String Lema;
    private int valorSub;
    private String Colores;
    private String nombreFundador;
    private int añoFundacion;
    private String pais;
    private String Descripcion;
    private int Cantidad;

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public Club(){
        this.Nombre = "Sin Asignar";
        this.Codigo = "";
        this.Lema = "Sin Asignar";
        this.valorSub = -1;
        this.Colores = "Sin asignar";
        this.añoFundacion = -1;
        this.pais = "Sin Asignar";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
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

    public String getNombreFundador() {
        return nombreFundador;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombreFundador = nombreFundador;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString(){
        return this.Descripcion + " $" + this.valorSub +
                " " + this.Cantidad;
    }
}
