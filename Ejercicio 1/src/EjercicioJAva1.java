import java.util.Scanner;

public class EjercicioJAva1 {

        public void ejercicioJAva1(){

            System.out.println("¿Como te llamas?");

            Scanner entrada = new Scanner (System.in);
            //System.in

            String nombre = entrada.next();

            System.out.println("¿A qué curso");
            String curso = entrada.next();


            System.out.println("Hola " + nombre + " Bienvenido a " + curso);
            System.out.println("Introduce un numero...");
            int num1 = entrada.nextInt();

            System.out.println("Introduce un numero...");
            int num2 = entrada.nextInt();

            int  resultado = num1 + num2;

            System.out.println("El resultado es" + resultado);

        }
}
