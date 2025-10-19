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

public class Empleado {
    private String primerNombre;
    private String primerApellido;
    private double salarioMensual;

    /** Constructor para inicializar las variables */
    public Empleado(String primerNombre, String primerApellido) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;

        /** Válida que el salario sea positivo */
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    /** Métodos setter */

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /** El metodo para validar que el salario no sea negativo*/
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    /** Métodos getter */

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    /** Metodo con respecto al aumento del salario */
    /** Aplica un aumento del 10% al salario mensual del empleado */
    public void darAumento(double porcentajeAumento)
    {
        double aumento = this.salarioMensual * (porcentajeAumento / 100.0);
        this.salarioMensual += aumento;
    }

    /** Calcula y devuelve el salario anual del empleado y retorna el salario mensual multiplicado por 12 (meses)*/
    public double getSalarioAnual() {
        return this.salarioMensual * 12;
    }
}