import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public void control_excepciones(){

        Scanner entrada= new Scanner(System.in);

        int numero;
        boolean error = true;

        while (error =true) {

            try {
                System.out.println("introduce un valor");
                numero = entrada.nextInt();
                error = false;
            }catch (InputMismatchException er){
                System.out.println("Error introcuzca valor correcto");
                entrada.nextLine();
            }

        }
    }

}
