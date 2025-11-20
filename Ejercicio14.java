import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el puesto (1-3): ");
        int puesto = sc.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("Oro");
                break;
            case 2:
                System.out.println("Plata");
                break;
            case 3:
                System.out.println("Bronce");
                break;
            default:
                System.out.println("Siga participando");
        }
    }
}


