import java.util.InputMismatchException;
import java.util.Scanner;

public class EJERCIO3 {
    public void EJERCIO_3 (){
        Scanner entrada = new Scanner(System.in);


        float num1 = 0;
        float num2 = 0;
        float resultado;
        int aux = 0;



        while (aux==0){

            try {
                System.out.println("introduce el dividendo");
                num1 = entrada.nextInt();

                System.out.println("introduce el valor divisor");
                num2 = entrada.nextInt();
                aux = 1;

        }catch (InputMismatchException er) {
            System.out.println("Error Introduzca valores correctos");
            entrada.nextLine();
        }

        }

        if (num2==0) {
            System.out.println("el divisor no puede ser");
        }else{
            resultado = (num1/num2);
            System.out.println("El resultado es " + resultado);
        }
    }
}
