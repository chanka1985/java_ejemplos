//Programa que genera 100 numeros aleatorios del 0 al 20 y luego pide dos numero para hacer el reemplazo

public class arrayex07{
    public static void main(String[] args){

        int[] matriz = new int[100];
        
        for(int x = 0;x<100;x++){
            matriz[x] = (int)(Math.random()*21);
        }

        for(int y=0;y<100;y++){
            System.out.print(matriz[y] + " | ");
        }

        System.out.print("Ingrese su valor a buscar : ");
        int a = Integer.parseInt(System.console().readLine());

        System.out.print("Ingrese por que valor lo quiere reemplazar : ");
        int b = Integer.parseInt(System.console().readLine());

        for(int j=0;j<100;j++){
            if(matriz[j]== a){
                System.out.print(" '"+b+"' ");
            }else{
                System.out.print(matriz[j]+" ");
            }
        }
    }
}