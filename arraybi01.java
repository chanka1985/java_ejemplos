import java.lang.Thread;;

//Primer array bidimensional
public class arraybi01{
    public static void main(String[] args)throws InterruptedException{ // Se añade esta linea para poder usar sleep

            int[][] n = new int[3][2];

            n[0][0] = 10;
            n[0][1] = 20;
            n[1][0] = 30;
            n[1][1] = 40;
            n[2][0] = 50;
            n[2][1] = 60;

            int fila, columna;

            for(fila = 0;fila<3;fila++){
                System.out.print("Fila: "+ fila);

                for(columna=0;columna<2;columna++){
                    System.out.printf("%10d",n[fila][columna]);
                    Thread.sleep(1000);//retardo de un segundo
                }
                System.out.println();
            }
    }
}