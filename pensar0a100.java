// adivinar numero de 0 a 100 en 5 intentos con notificacion de intentos.
import java.util.Scanner;

public class pensar0a100{
    public static void main(String[] args){
        int intento = 0;
        int valor;
        Scanner leer = new Scanner(System.in);
        int numero;

        valor = (int)(Math.random()*100);

        System.out.println(valor); //solo para verificar el numero generado aleatoriamente

        do{
            System.out.println("Escriba el numero : ");
            numero = leer.nextInt();
            if(numero == valor){
                System.out.println("El numero es correcto");
                intento = 5;
            }else{
                intento += 1;
                if(numero < valor){
                    System.out.println("El numero es mayor que " + numero);
                }else{
                    System.out.println("El numero es menor que " + numero);
                }
                System.out.println("Te quedan " + (5 - intento) + " intentos ");
            }
        }while(intento < 5);

        System.out.println(valor);
    }
}