//Programa que pide 10 numeros y los muestra indicando el minimo y el maximo

public class arrayex05{
    public static void main(String[] args){
        int[] numero = new int[10];
        int min;
        int max;

        System.out.println("Por favor introduzca 10 numeros : ");

        for(int x=0;x<10;x++){
            numero[x]=Integer.parseInt(System.console().readLine());
        }

        min = numero[0];
        max = numero[0];

        for(int y=0;y<10;y++){
            if(numero[y] >= max){
                max = numero[y];
            }

            if(numero[y] <= min){
                min = numero[y];
            }
        }

        System.out.println("--------------------------------------------");

        for(int a = 0;a<10;a++){
            System.out.print(numero[a]);
            if(numero[a]== min){
                System.out.print("  Minimo");
            }
            if(numero[a]==max){
                System.out.print("  Maximo");
            }
            System.out.println();
        }

    }
}