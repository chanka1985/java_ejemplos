// muestra la tabla del numero ingresado por teclado
import java.util.Scanner;

class tabla{
    public static void main(String[] args){
        int tabla;
        Scanner numerador = new Scanner(System.in);
        int x;
        System.out.println("Por favor ingrese el numero de la tabla que desea generar : ");
        tabla = numerador.nextInt();
        for(x = 1;x < 13;x++){
            System.out.println(tabla + " * " + x + " = " + (tabla * x));
        }
    }
}