// otra de arrays

public class array02{
    public static void main(String[] args){
        int[] x = new int[5]; // declaracion e inicializacion de array en una sola linea
        x[0] = 13;
        x[1] = 23;
        x[2] = 53;
        x[3] = 756;
        x[4] = 456;

        //Tambien se puede llenar los elementos del array en una sola linea:
        /*
        int[] x = {13, 23, 53, 756, 456};
        */

        System.out.println("Ingrese el indice de la posicion del array que quiere ver(0,1,2,3,4)");
        int indice = Integer.parseInt(System.console().readLine());

        System.out.println("El elemento que se encuentra en la posicion " + indice + " es " + x[indice]);
    }
}