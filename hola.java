import java.util.Scanner;

//programa de prueba
class hola{
    public static void main(String [] args){
        System.out.print("Como te llamas :");
        String nombre = System.console().readLine();
        System.out.println("Bienvenido " + nombre);

        Scanner lector = new Scanner(System.in);
        System.out.print("Ahora " + nombre + " dinos tu edad por favor : ");
        int edad = lector.nextInt();
    }
}