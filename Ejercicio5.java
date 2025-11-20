import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el puesto: ");
        int puesto = sc.nextInt();
        if (puesto == 1)
            System.out.println("Oro");
        else if (puesto == 2)
            System.out.println("Plata");
        else if (puesto == 3)
            System.out.println("Bronce");
        else
            System.out.println("Siga participando");
    }
}
