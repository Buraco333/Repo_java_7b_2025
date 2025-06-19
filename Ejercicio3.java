import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del mes
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convierte a minúsculas para evitar errores

        int dias;

        // Determinar la cantidad de días según el mes
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dias = 30;
        } else if (mes.equals("febrero")) {
            dias = 28;
        } else {
            dias = 31;
        }

        // Mostrar resultado con la primera letra en mayúscula
        String mesFormateado = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        System.out.println("El mes de " + mesFormateado + " tiene " + dias + " días.");

        scanner.close();
    }
}
