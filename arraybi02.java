// array bidimensional inicializado de inmediato

public class arraybi02{
    public static void main(String[] args)throws InterruptedException{

        int[][] n = {{12,34},{124,344},{98,238}};
        int fila, columna;
        for(fila=0;fila<3;fila++){
            System.out.print("Fila : " + fila);

            for(columna=0;columna<2;columna++){
                System.out.printf("%10d ",n[fila][columna]);
                Thread.sleep(1000);
            }
            System.out.println();
        }
    }
}