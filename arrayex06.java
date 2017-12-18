// Programa que lee 15 numeros y luego corre una posicion sus valores

public class arrayex06{
    public static void main(String[] args){
        int[] vector = new int[15];

        System.out.println("Ingresa 15 numeros :");

        for(int x = 0;x<15;x++){
            vector[x] = Integer.parseInt(System.console().readLine());
        }

        for(int y = 0;y<14;y++){
            vector[y] = vector[y+1];
            if(y==13){
                vector[14] = vector[0];
            }
        }

        for(int h=0;h<15;h++){
            System.out.println("vector[" +h+"] = "+ vector[h]);
        }
    }
}