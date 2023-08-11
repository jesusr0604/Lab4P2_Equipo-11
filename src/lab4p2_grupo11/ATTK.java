package lab4p2_grupo11;

public class ATTK extends Movimiento{
    public int PuntosDePoder;
    public int PuntosDePresicion;

    public ATTK(int PuntosDePoder, int PuntosDePresicion, String nombre, String Descripcion) {
        super(nombre, Descripcion);
        this.PuntosDePoder = PuntosDePoder;
        this.PuntosDePresicion = PuntosDePresicion;
    }

    public int getPuntosDePoder() {
        return PuntosDePoder;
    }

    public void setPuntosDePoder(int PuntosDePoder) {
        this.PuntosDePoder = PuntosDePoder;
    }

    public int getPuntosDePresicion() {
        return PuntosDePresicion;
    }

    public void setPuntosDePresicion(int PuntosDePresicion) {
        this.PuntosDePresicion = PuntosDePresicion;
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
        return "ATTK{" + "PuntosDePoder=" + PuntosDePoder + ", PuntosDePresicion=" + PuntosDePresicion + '}';
    }
    
    
    
}
