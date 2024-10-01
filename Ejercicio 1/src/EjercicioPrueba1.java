import java.util.Scanner;

public class EjercicioPrueba1 {
    public void EjercicoPrueba1() {

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        //System.in

        String nombre = entrada.next();

        System.out.println("¿A qué curso");
        String curso = entrada.next();


        System.out.println("Hola " + nombre + " Bienvenido a " + curso);

        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {
            System.out.println("Introduce un numero...");
            num1 = entrada.nextInt();

            System.out.println("Introduce un numero...");
            num2 = entrada.nextInt();

            if (num1 == num2) {}

            int resultado = num1 + num2;

            System.out.println("El resultado es" + resultado);
            num2 = entrada.nextInt();

            if (num1 != num2) {
                resultado = num1 + num2;
                System.out.println("El resultado del la suma es" + resultado);

            } else {
                //pedir otra vez
            }
        }
    }}