/**
 * @author Isaac Quishpe
 * @deprecated 3.14(La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día
 * (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice las tres variables de instancia,
 * y debe asumir que los valores que se proporcionan son correctos.
 * Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione un método mostrarFecha,
 * que muestre el mes, día y año, separados por barras diagonales (/).
 * Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
 *
 */


import javax.swing.*;
import java.util.Scanner;

public class Fecha {
    //declaracion de parametros
    private int mes;
    private int dia;
    private int anio;


    // constructor
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;


    }

    //getters and setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /** Por cumplir con el requisito de usar ventanas emergentes cambiamos por JOption pane*/
    /* metodo para mostrar datos*/
    // public void mostrarDatos(){

    //      System.out.print(dia  +" /" + mes + "/" + anio );
    //  }

    /**
     * Metodo modificado con JOption pane para mostrar la fecha
     */
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "****Fecha ingresada****\n"+dia + " / " + mes + " / " + anio);
    }

}
