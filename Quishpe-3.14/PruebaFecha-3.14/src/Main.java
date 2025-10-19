import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;


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

    }
}