//muestr 50 numeros aleatorios entre 100 y 199
public class aleatorio50{
    public static void main(String[] args){
        int maximo = 100;
        int minimo = 199;
        int media = 0;
        int suma = 0;

        for(int x = 0;x < 50;x++){
            int valor = (int)(Math.random()*100)+100;
            System.out.print(valor + " ");
            if(valor > maximo){
                maximo = valor;
            }
            if(valor < minimo){
                minimo = valor;
            }
            suma += valor;
        }

        media = (int)(suma / 50);

        System.out.println("\n");
        System.out.println("El maximo numero es " + maximo);
        System.out.println("El minimo numero es " + minimo);
        System.out.println("La media es " + media);
    }
}