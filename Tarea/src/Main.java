import java.util.ArrayList;
import java.util.Date;

public class Main{
    public static void Main( String[] arg) {

    }
}

class OrdenCompra {
    private Date fecha;
    private String estado;

    public nose(ArrayList<DetalleOrden> a) {

    }

    public calcPrecioSinIVA(ArrayList<DetalleOrden> a) {
    }

}

class Pago{
    private static float monto;
    private Date fecha;

    public Pago(float m, Date f) {
        this.monto = m;
        this.fecha= f;
    }
    public float getmonto() {
        return monto;
    }

}
class Efectivo extends Pago{

    public Efectivo(float m, Date f) {
        super(m, f);
    }


    public float calDevolucion(float d){
        float v = d - getmonto();
        return v;

    }
}
class Transferencia extends Pago{

    private String banco;
    private String numeroCuenta;

    public Transferencia(float m, Date f, String b, String n) {
        super(m, f);
        this.banco = b;
        this.numeroCuenta = n;
    }
}
class Tarjeta extends Pago{
    private String tipo;
    private String numeroTransaccion;

    public Tarjeta(float m, Date f, String tipo, String numeroTransaccion) {
        super(m, f);
        this.tipo = tipo;
        this.numeroTransaccion = numeroTransaccion;
    }
}

class documentoTributario{
    private String numero;
    private String rut;
    private Date fecha;

    public documentoTributario(String numero, String rut, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public String getRut() {
        return rut;
    }

    public Date getFecha() {
        return fecha;
    }
}
class Boleta extends documentoTributario{

    public Boleta(String numero, String rut, Date fecha) {
        super(numero, rut, fecha);
    }
}

class Factura extends documentoTributario{

    public Factura(String numero, String rut, Date fecha) {
        super(numero, rut, fecha);
    }
}

class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
}

class DetalleOrden{
    private int cantidad; // esta es la cantidad de articulos, no precios
    private ArrayList <Articulo> Lista;

    private float cuentaTotal;

    public DetalleOrden(){
        Lista= new ArrayList<>();
    }

    public void add(Articulo a){
        cuentaTotal=a.getPrecio();
        Lista.add(a);
    }

    public float calcPrecio(){
        float p= (float) (cantidad*cuentaTotal*(1.19));
        return p;
    }

    public float calcPrecioSinIVA(){
        float pp=cantidad*cuentaTotal;
        return pp;
    }
    public float calcIVA(){
        float i= (float) (cuentaTotal*(0.19)*cantidad);
        return i;
    }
    public float calcPeso(){
        float c=cuentaTotal*cantidad;
        return c;
    }
}

class Direccion{
    private String nombre;
    private String rut;


}
class cliente{
    private String Direccion;
}