// programa que pide la combinacion de cuatro digitos, al cuarto intento sale mensaje de error
import java.util.Scanner;
class cajafuerte{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int clave = 0;
        int contador = 0;
        do{
            System.out.println("Por favor ingrese la combinacion de cuatro cifras");
            clave = leer.nextInt();
            contador += 1;
            if(clave == 1357){
                System.out.println("Combinacion correcta, bienvenido...!!!");
                contador = 4; 
            }
        }while(contador < 4);
    }
}