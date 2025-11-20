
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota 1: "); int nota1 = sc.nextInt();
        System.out.print("Ingrese nota 2: "); int nota2 = sc.nextInt();
        System.out.print("Ingrese nota 3: "); int nota3 = sc.nextInt();
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        if (promedio >= 7)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobado");
    }
}
