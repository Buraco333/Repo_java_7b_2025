import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una categoría (a, b, c): ");
        char categoria = sc.next().toLowerCase().charAt(0);
        if (categoria == 'a')
            System.out.println("hijo");
        else if (categoria == 'b')
            System.out.println("padres");
        else if (categoria == 'c')
            System.out.println("abuelos");
    }
}
