//Programa que pide 8 numeros enteros e imprime indicando si es par o impar
public class arrayex09{
    public static void main(String[] args){

        int[] array= new int[8];

        for(int x = 0;x<8;x++){
            array[x]=Integer.parseInt(System.console().readLine());
        }

        for(int y=0;y<8;y++){
            System.out.print(array[y]);
            if(array[y] % 2 ==0){
                System.out.print(" par");
            }else{
                System.out.print(" impar");
            }
            System.out.println();
        }
    }
}