import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;
/** Por cumplir con el requisito de usar ventanas emergentes cambiamos println y printf por JOption pane*/
/**
 Scanner sc= new Scanner(System.in);

 do{
 System.out.println("Ingrese el dia: ");
 dia= sc.nextInt();


 }while(dia <= 0 || dia >= 32);;

 do {


 System.out.println("Ingrese el mes: ");
 mes = sc.nextInt();
 }while(mes <= 0 || mes >= 13);;

 do {


 System.out.println("Ingrese el anio");
 anio = sc.nextInt();
 }while(anio <=2000 || anio >= 2026);;

 Fecha fecha1 = new Fecha(dia, mes, anio);

 System.out.println("****Fecha ingresada****");
 fecha1.mostrarDatos();
 */
/** Usando JOptionPane para entrada y salida de datos */
        do {
            String diaStr = JOptionPane.showInputDialog(null, "Ingrese el día (1-31):");
            dia = Integer.parseInt(diaStr);
        } while (dia <= 0 || dia > 31);

        do {
            String mesStr = JOptionPane.showInputDialog(null, "Ingrese el mes (1-12):");
            mes = Integer.parseInt(mesStr);
        } while (mes <= 0 || mes > 12);

        do {
            String anioStr = JOptionPane.showInputDialog(null, "Ingrese el año (ej: 2025):");
            anio = Integer.parseInt(anioStr);
        } while (anio <= 0);
        Fecha fecha1 = new Fecha(mes, dia, anio);
        fecha1.mostrarDatos();
    }
}