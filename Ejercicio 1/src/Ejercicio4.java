import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        Scanner entrada = new Scanner(System.in);


        float num1 = 0;
        float num2 = 0;
        float resultado;
        int aux = 0;

        while (aux==0) {

            try {
                System.out.println("Introduzca valor de la Altura(h)");
                num1 = entrada.nextInt();

                System.out.println("Introduzca valor de la Base(b)");
                num2 = entrada.nextInt();
                aux = 1;

            } catch (InputMismatchException er) {
                System.out.println("Error Introduzca valor de la Altura(h)");
                entrada.nextLine();

                System.out.println("Error introduzca valores de la Base");
                entrada.nextLine();
            }if(resultado=(num1*num2/2){
            System.out.println("El resultado es " + resultado);
            }
        }
    }
}