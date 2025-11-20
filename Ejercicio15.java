import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la clase del auto (a, b, c): ");
        char clase = sc.next().charAt(0);

        switch (clase) {
            case 'a':
                System.out.println("4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("4 ruedas, motor, cierre centralizado y aire");
                break;
            case 'c':
                System.out.println("4 ruedas, motor, cierre centralizado, aire y airbag");
                break;
            default:
                System.out.println("Clase desconocida");
        }
    }
}
