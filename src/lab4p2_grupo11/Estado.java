package lab4p2_grupo11;

public class Estado extends Movimiento{
    public String ProblemaDeEstado;
    
    public Estado(String nombre, String Descripcion) {
        super(nombre, Descripcion);
    }

    public Estado(String ProblemaDeEstado, String nombre, String Descripcion) {
        super(nombre, Descripcion);
        this.ProblemaDeEstado = ProblemaDeEstado;
    }

    public String getProblemaDeEstado() {
        return ProblemaDeEstado;
    }

    public void setProblemaDeEstado(String ProblemaDeEstado) {
        this.ProblemaDeEstado = ProblemaDeEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Estado{" + "ProblemaDeEstado=" + ProblemaDeEstado + '}';
    }


    
}
