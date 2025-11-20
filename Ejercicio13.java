import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un mes: ");
        String mes = sc.nextLine().toLowerCase();

        switch (mes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println(mes + " tiene 30 días.");
                break;
            case "febrero":
                System.out.println("Febrero tiene 28 días.");
                break;
            default:
                System.out.println(mes + " tiene 31 días.");
        }
    }
}

