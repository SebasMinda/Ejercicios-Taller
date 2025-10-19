public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;
    private double altura;
    private double peso;


    public PerfilMedico(String primerNombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int añoNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Metodo para calcular la edad */

    public int CalcularEdad() {
        int añoActual = 2025;  // O puedes usar un valor dinámico, como Calendar.getInstance().get(Calendar.YEAR)
        int edadPerfil = añoActual - añoNacimiento;

        // Verificar si la persona ya cumplió años este año
        if (mesNacimiento > 10 || (mesNacimiento == 10 && diaNacimiento > 17)) {
            edadPerfil--;
        }

        return edadPerfil;
    }

    // Metodo para calcular el índice de masa corporal (BMI)*/
    public double calcularBMI() {
        double alturaEnMetros = altura / 100.0;
        return peso / (alturaEnMetros * alturaEnMetros);
    }

    // Metodo para calcular la frecuencia cardiaca máxima*/
    public int calcularFCM() {
        return 220 - CalcularEdad();
    }

    // Metodo para calcular el rango de frecuencia cardiaca esperado*/
    public String calcularRangoFC() {
        int fcm = calcularFCM();
        double min = fcm * 0.50;
        double max = fcm * 0.85;
        return String.format("Rango esperado: %.0f - %.0f bpm", min, max);
    }

    // Metodo para clasificar el BMI*/
    public String clasificarBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }

    }
}
