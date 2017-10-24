//utilizando Scanner
import java.util.Scanner;

class leyendo1{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = n.nextLine();
        System.out.print("Introduce tu edad: ");
        int e = Integer.parseInt(n.nextLine());

        System.out.println("Tu nombre es " + nombre + " y tienes " + e + " años.");
    }
}