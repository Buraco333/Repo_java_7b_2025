import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Generar un número al azar entre 1 y 100
        Random random = new Random();
        int numero = random.nextInt(100) + 1; // número entre 1 y 100

        // Verificar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}

