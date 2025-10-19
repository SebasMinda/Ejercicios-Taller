import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PerfilMedico perfilMedico1 = new PerfilMedico("Paul","Walker","Masculino",12,9,1973,188,78);
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer Nombre : ");
        perfilMedico1.setPrimerNombre(sc.nextLine());
        System.out.println("Apellido : ");
        perfilMedico1.setApellido(sc.nextLine());
        System.out.println("Sexo : ");
        perfilMedico1.setSexo(sc.nextLine());
        System.out.println("Dia de Nacimiento : ");
        perfilMedico1.setDiaNacimiento(Integer.parseInt(sc.nextLine()));
        System.out.println("Mes de Nacimiento : ");
        perfilMedico1.setMesNacimiento(Integer.parseInt(sc.nextLine()));
        System.out.println("Año de Nacimiento : ");
        perfilMedico1.setAñoNacimiento(Integer.parseInt(sc.nextLine()));
        System.out.println("Altura : ");
        perfilMedico1.setAltura(Integer.parseInt(sc.nextLine()));
        System.out.println("Peso : ");
        perfilMedico1.setPeso(Integer.parseInt(sc.nextLine()));

        // Calcular y mostrar la edad*/
        int edad = perfilMedico1.CalcularEdad();
        System.out.println("Edad: " + edad + " años");

        // Calcular y mostrar el BMI*/
        double bmi = perfilMedico1.calcularBMI();
        System.out.println("Índice de Masa Corporal (BMI): " + String.format("%.2f", bmi));
        System.out.println("Clasificación del BMI: " + perfilMedico1.clasificarBMI());

        // Calcular y mostrar la Frecuencia Cardiaca Máxima*/
        int fcm = perfilMedico1.calcularFCM();
        System.out.println("Frecuencia Cardiaca Máxima: " + fcm + " bpm");

        // Calcular y mostrar el rango de Frecuencia Cardiaca Esperada*/
        String rangoFC = perfilMedico1.calcularRangoFC();
        System.out.println("Rango esperado de Frecuencia Cardiaca: " + rangoFC);
    }
}
