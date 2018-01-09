//Programa que genera 20 numeros aleatorios y prioriza en ordenar los numeros pares.
public class arrayex10{
    public static void main(String[] args){
        int[] matriz1 = new int[20];
        int[] matriz2 = new int[20];

        int contimpar = 19;
        int contpar = 0;

        for(int x = 0;x<20;x++){
            matriz1[x]=(int)(Math.random()*100);
           // matriz2[x]=matriz1[x];
        }

        for(int c = 0;c<20;c++){
            System.out.print(matriz1[c] + "  ");
        }

        System.out.println();

        for(int y = 0;y<20;y++){
            if((matriz1[y] % 2) == 0){
                matriz2[contpar]=matriz1[y];
                contpar += 1;
            }else{
                matriz2[contimpar]=matriz1[y];
                contimpar -= 1;
            }
        }

        for(int z = 0;z<20;z++){
            System.out.print(matriz2[z] + "  ");
        }
    }
}