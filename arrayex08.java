//Programa que pide las temperaturas de los meses de un a�o e imprime barras horizontales con las temperaturas.
public class arrayex08{
    public static void main(String[] args){
        int[] mes=new int[12];
        
        System.out.print("Por favor ingrese la temperatura media del ultimo año :");

        for(int x=0;x<12;x++){
            mes[x]=Integer.parseInt(System.console().readLine());
        }

        for(int y=0;y<12;y++){
            for(int z=0;z<mes[y];z++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}