
import CPJ.Club;
import CPJ.Suscripcion;
import CPJ.Usuario;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setID(1000);
        u.setNombreCompleto("Benjamin Matias Herrera Astudillo");
        u.setRut(17823893);
        u.setDV("-K");
        u.setEmail("bematherras@gmail.com");
        u.setTelefono(987654321);
        u.setNombreUsuario("benjamha");
        u.setEdad(18);
        
        int correlativo = 1010;
        
        Club c = new Club();
        c.setNombre("Manquehue City");
        c.setLema("Vivir y fuerza");
        c.setValorSub(15100);
        c.setColores("Celeste, Blanco");
        
        
        System.out.println("Suscribiendose...");
        Suscripcion s = new Suscripcion();
        s.setNumero(++correlativo);
        s.setFechaInicio(new Date());
        s.setUsuario(u);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        s.agregarProducto(c);
        System.out.println("Subscripcion finalizada");
        System.out.println(s.toString());
    }
    }
    

