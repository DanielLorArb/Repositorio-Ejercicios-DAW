import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2(){

        Scanner entrada= new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;


        while(num1 == num2) {
            System.out.println("Introduce un numero...");
            num1 = entrada.nextInt();
            System.out.println("Introduce un numero...");
            num2 = entrada.nextInt();

            if (num1 == num2) {
                System.out.println("ERROR: los números introducidos son iguales");
            }else{

                if (num1 > num2){
                    System.out.println("El numero " + num1 + " es el mayor");
                }else{

                    System.out.println("El Resultado es " + num2 + " es el mayor");
                }
        }
    }}

    }

