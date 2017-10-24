//programa que pide nombre y apellido
import java.util.Scanner;

class leyendo2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor introduzca su nombre y su edad seguido de un espacio  :  ");
        String nom = s.next();
        int eda = s.nextInt();
        System.out.println("Tu nombre es " + nom + " y tu edad es " + eda + " años");
    }
}