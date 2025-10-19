/**Universidad de las Américas
 * Facultad de Ingeniería y Ciencias Aplicadas
 * Carrera: Ingeniería de Software
 * Programación Orientada a Objetos - Programación II
 * Profesor: Victor Gómez
 * Estudiante: Pablo Fernández, Sebastián Minda
 * Fecha: 14/10/2025
 * Tercer semestre
 * Ejercicio 3.13 - La clase Empleado
 */

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia:
         un primer nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double).
         Su clase debe tener un constructor que inicialice las tres variables de instancia.
         Proporcione un metodo establecer y un metodo obtener para cada variable de instancia.
         Si el salario mensual no es positivo, no establezca su valor.
         Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase
         Empleado.
         Cree dos objetos Empleado y muestre el salario anual de cada objeto.
         Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado
         otra vez
         */


        /** Crear el constructor scanner para ingresar los salarios*/
        Scanner sc = new Scanner(System.in);

        /** Crear dos objetos de la clase Empleado */
        Empleado empleado1 = new Empleado("Jhon", "Lambert");
        Empleado empleado2 = new Empleado("Francis","Jimenez");

        /** Pedir salario para registrar en cada objeto de la clase empleado*/
        /**Al inicio se usa la funcion Scan, pero por diseño escogimos usar el JOption pane*/
        //System.out.printf("Ingrese el salario del primer empleado: ");
        //empleado1.setSalarioMensual(sc.nextDouble());
        //System.out.printf("Ingrese el salario del segundo empleado: ");
        //empleado2.setSalarioMensual(sc.nextDouble());
        empleado1.setSalarioMensual(Double.parseDouble(JOptionPane.showInputDialog("Salario del primer empleado")));
        empleado2.setSalarioMensual(Double.parseDouble(JOptionPane.showInputDialog("Salario del segundo empleado")));





        /** Mostrar salarios mensuales y anuales*/
        /** Salario mensual */
        System.out.println("Salarios Mensuales");
        System.out.printf("Salario mensual de %s %s: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getPrimerApellido(), empleado1.getSalarioMensual());
        System.out.printf("Salario mensual de %s %s: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getPrimerApellido(), empleado2.getSalarioMensual());
        /** Salario anual */
        System.out.println("Salarios anuales");
        System.out.printf("Salario anual de %s %s: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getPrimerApellido(), empleado1.getSalarioAnual());

        System.out.printf("Salario anual de %s %s: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getPrimerApellido(), empleado2.getSalarioAnual());

        System.out.println("\n");

        /** Da un aumento del 10% a cada empleado */
        System.out.println("Salario con un aumento del 10%:");
        empleado1.darAumento(10); /** Este 10 puede cambiar ya que no se le hizo fijo como constante */
        empleado2.darAumento(10);
        System.out.println("El aumento se ha aplicado de manera exitosa.");
        System.out.println("\n");

        /** Mostrar los salarios anuales después del aumento*/
        System.out.println("--- Salarios Anuales Después del Aumento ---");
        System.out.printf("Nuevo salario anual de %s %s: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getPrimerApellido(), empleado1.getSalarioAnual());
        System.out.printf("Nuevo salario anual de %s %s: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getPrimerApellido(), empleado2.getSalarioAnual());
    }
}
