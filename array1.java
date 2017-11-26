//iniciando con arrays
public class array1{
    public static void main(String[] args){
        int[] n; // se define n como un array de enteros
        n = new int [4]; // se  reserva espacio para 4 enteros
        
        n[0] = 23;
        n[1] = 65;
        n[2] = 87;
        n[3] = 133;

        System.out.println("Los valores del array son :" + "n[0] " + n[0] + " n[1] " + n[1] + " n[2] " + n[2] + " n[3] " + n[3]);
        
        int suma = n[1] + n[3];

        System.out.println("La suma de n[1] + n[3] es " + suma);
    }
}