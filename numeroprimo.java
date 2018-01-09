//Dice si un numero es primo o no sin funciones
public class numeroprimo{
    public static void main(String[] args){

        System.out.print("Introduce un numero entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        boolean esprimo = true;
        for(int x = 2;x < n;x++){
            if((n % x) == 0){
                esprimo = false;
            }
        }

        if(esprimo){
            System.out.println("El " + n + " es primo.");
        }else{
            System.out.println("El " + n + " no es primo");
        }
    }
}