import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1 (0=piedra, 1=papel, 2=tijera): ");
        int jugador1 = sc.nextInt();
        System.out.print("Jugador 2 (0=piedra, 1=papel, 2=tijera): ");
        int jugador2 = sc.nextInt();
        if ((jugador1 == 0 && jugador2 == 2) ||
            (jugador1 == 1 && jugador2 == 0) ||
            (jugador1 == 2 && jugador2 == 1))
            System.out.println("Jugador 1 gana");
        else if (jugador1 == jugador2)
            System.out.println("Empate");
        else
            System.out.println("Jugador 2 gana");
    }
}

