import java.util.Scanner;

public class Ejercicio17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        int n1 = sc.nextInt();
        System.out.print("Nota 2: ");
        int n2 = sc.nextInt();
        System.out.print("Nota 3: ");
        int n3 = sc.nextInt();

        int suma = (n1 % 2 == 0 ? n1 : 0) + (n2 % 2 == 0 ? n2 : 0) + (n3 % 2 == 0 ? n3 : 0);
        System.out.println("Suma de notas pares: " + suma);
    }
}
