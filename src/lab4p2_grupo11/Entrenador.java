
package lab4p2_grupo11;

import java.util.ArrayList;


public class Entrenador {
    private String nombre;
    private int edad;
    private double dinero;
    private String[] Pokemon;
    private ArrayList<Pokemon>caja;

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    
    

    public Entrenador(String nombre, int edad, double dinero, String[] Pokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.Pokemon = Pokemon;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String[] getPokemon() {
        return Pokemon;
    }

    public void setPokemon(String[] Pokemon) {
        this.Pokemon = Pokemon;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", Pokemon=" + Pokemon + ", caja=" + caja + '}';
    }
    
    
}
