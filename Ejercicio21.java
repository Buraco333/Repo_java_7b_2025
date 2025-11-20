import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Categoría (a, b, c): ");
        char categoria = sc.next().toLowerCase().charAt(0);

        System.out.print("Antigüedad (años): ");
        int antiguedad = sc.nextInt();

        System.out.print("Sueldo bruto: ");
        double sueldo = sc.nextDouble();

        double aumento;
        if (antiguedad >= 1 && antiguedad <= 5) aumento = 0.05;
        else if (antiguedad <= 10) aumento = 0.10;
        else aumento = 0.30;

        int plus = (categoria == 'a') ? 1000 : (categoria == 'b') ? 2000 : 3000;
        double sueldoNeto = sueldo + (sueldo * aumento) + plus;

        System.out.println("Sueldo neto: $" + sueldoNeto);
    }
}



