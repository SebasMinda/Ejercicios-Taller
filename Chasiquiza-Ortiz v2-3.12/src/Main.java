import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Descripcion de la pieza : ");
        String desPieza = sc.nextLine();
        System.out.println();
        System.out.print("Cantidad de Articulos :");
        Double cantArticulos = Double.valueOf(sc.nextLine());
        System.out.println();
        System.out.print("Numero de Pieza :");
        String numPieza = sc.nextLine();
        System.out.println();
        System.out.print("Precio del Articulo :");
        Double preArticulo = Double.valueOf(sc.nextLine());

        Factura pruebaFactura = new Factura(desPieza, cantArticulos, numPieza, preArticulo);

        pruebaFactura.obtenerMontoFactura();

    }
}