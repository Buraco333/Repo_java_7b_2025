public class Ejercicio20 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;
        do {
            int num = (int)(Math.random() * 100);
            if (num > max) max = num;
            if (num < min) min = num;
            System.out.println("Número: " + num);
            i++;
        } while (i < 10);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}

