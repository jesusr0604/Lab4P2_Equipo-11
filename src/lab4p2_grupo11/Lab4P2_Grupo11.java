package lab4p2_grupo11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;

public class Lab4P2_Grupo11 {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        ArrayList<Entrenador> trainer = new ArrayList();
        int res = 0;
        do {
            System.out.println("----- Bienvenido al Sistema Pokemon -----"
                    + "\n1 -> Registrar entrenador "
                    + "\n2 -> Battle Factory "
                    + "\n3 ->  Capturar/Entrenar"
                    + "\n4 ->  Añadir Movimiento"
                    + "\n0-> Salir"
                    + "\nIngrese la opcion que desea:");

            res = leer.nextInt();
            switch (res) {
                case 1: {
                    System.out.println("Ingrese su nombre: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese su Edad: ");
                    int edad = leer.nextInt();

                    double dinero = 0;
                    do {
                        System.out.println("Ingrese cuanto dinero tiene: ");
                        dinero = leer.nextDouble();
                    } while (dinero < 1);
                    Entrenador T = new Entrenador(nombre, edad, dinero);
                    trainer.add(T);

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 0:{
                    System.out.println("Adios...");
                }
                break;
                default:{
                    System.out.println("No Valido");
                }
                break;
            }
        } while (res != 0);
    }
}
