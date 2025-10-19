public class Factura {
    private String DesPieza;
    private Double CantArticulos;
    private String NumPieza;
    private Double PreArticulo;

    public Factura(String desPieza, Double cantArticulos, String numPieza, Double preArticulo) {
        DesPieza = desPieza;
        CantArticulos = cantArticulos;
        NumPieza = numPieza;
        PreArticulo = preArticulo;
    }

    public String getDesPieza() {
        return DesPieza;
    }

    public void setDesPieza(String desPieza) {
        DesPieza = desPieza;
    }

    public Double getCantArticulos() {
        return CantArticulos;
    }

    public void setCantArticulos(Double cantArticulos) {
        CantArticulos = cantArticulos;
    }

    public String getNumPieza() {
        return NumPieza;
    }

    public void setNumPieza(String numPieza) {
        NumPieza = numPieza;
    }

    public Double getPreArticulo() {
        return PreArticulo;
    }

    public void setPreArticulo(Double preArticulo) {
        PreArticulo = preArticulo;
    }


    public double obtenerMontoFactura() {
        if (CantArticulos < 0)
            CantArticulos = 0.0;
        if (PreArticulo == 0)
            PreArticulo = 0.0;
        double total = CantArticulos * PreArticulo;
        System.out.println("La descripcion de la pieza es: " +this.DesPieza);
        System.out.println("La cantidad de Articulos es: " + this.CantArticulos);
        System.out.println("El numero de Pieza es: " + this.NumPieza);
        System.out.println("El precio del articulo es: " + this.PreArticulo);
        System.out.println("El monto de la factura es: " + total);

        return total;
    }
}


