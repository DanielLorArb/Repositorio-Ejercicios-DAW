import java.util.Scanner;

public class Ejercio1 {
    public void Ejercicio1(){
        Scanner entrada= new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        float num0 = 0;
        float resultado1;
        float resultado2;

        while(num1 == num2) {
            System.out.println("Introduce un numero...");
            num1 = entrada.nextInt();
            System.out.println("Introduce un numero...");
            num2 = entrada.nextInt();

            if (num0 <= num2) {
                System.out.println("El Numero 2 es mayor 0");
            }else{
                resultado1 = (num2);
                System.out.println("El resultado es " + resultado1);
            }
            if (num0 <= num1){
                System.out.println("El numero 1 es mayor 0");
            }else{
                resultado2 = (num2);
                System.out.println("El Resultado es " + resultado2);
            }
    }
}}
