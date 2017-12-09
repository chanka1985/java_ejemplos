//Programa que pide 10 numeros por teclado y luego los muestra a la inversa

public class arrayex03{
    public static void main(String[] args){
        int[] matriz = new int[10]; // Declarando la matriz

        System.out.println("Por favor ingrese 10 numeros enteros :");
        //Lennando el array con los datos del usuario ingresado por teclado
        for(int x = 0;x < 10;x++){
            matriz[x] = Integer.parseInt(System.console().readLine());
        }

        //Mostrar los datos del usuario por pantalla en orden inverso
        for(int y = 9;y > -1;y--){
            System.out.print(matriz[y]+ "  ");
        }
    }
}