public class Ejercicio22 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            char[] categorias = {'a', 'b', 'c'};
            char categoria = categorias[(int)(Math.random() * 3)];
            int antiguedad = (int)(Math.random() * 20) + 1;
            double sueldo = (int)(Math.random() * 10000) + 30000;

            double aumento = antiguedad <= 5 ? 0.05 :
                             (antiguedad <= 10 ? 0.10 : 0.30);
            int plus = (categoria == 'a') ? 1000 : (categoria == 'b') ? 2000 : 3000;
            double sueldoNeto = sueldo + (sueldo * aumento) + plus;

            System.out.printf("Empleado %d - Cat: %c, Ant: %d, Sueldo neto: %.2f%n", i + 1, categoria, antiguedad, sueldoNeto);
            i++;
        }
    }
}





