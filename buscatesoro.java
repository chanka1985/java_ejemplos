//Minijuego "Busca tesoro"

//Se colocan una mina y un tesoro de forma aleatoria en un cuadrante
//de 4 filas y 5 columnas. el usuario intentara averiguar donde
//esta el tesoro 

public class buscatesoro{

    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args){

        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        //Inicializando el array
        for(x=0;x<4;x++){
            for(y=0;y<3;y++){
                cuadrante[x][y] = VACIO;
            }
        }

        //Colocando la mina
        int minaX = (int)(Math.random()*4);
        int minaY = (int)(Math.random()*3);
        cuadrante[minaX][minaY] = MINA;

        //Colocando el tesoro
        int tesoroX;
        int tesoroY;
        do{
            tesoroX = (int)(Math.random()*4);
            tesoroY = (int)(Math.random()*3);
        }while((minaX==tesoroX)&&(minaY==tesoroY));
        cuadrante[tesoroX][tesoroY]= TESORO;

        //juego
        System.out.println("BUSCA EL TESORO..!!!");
        boolean salir = false;
        String c = "";
            do{
                //pinta el cuadrante
                for(y=3;y>=0;y--){
                    System.out.print(y+" |");
                    for(x=0;x<5;x++){
                        if(cuadrante[x][y]== INTENTO)
                        System.out.print("x ");
                        else
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println("  -----------\n   0 1 2 3 4\n");

                //pide las coordenadas
                System.out.print("Coordenadas x: ");
                x= Integer.parseInt(System.console().readLine());
                System.out.print("Coordenadas y: ");
                y= Integer.parseInt(System.console().readLine());
                
                //mira lo que hay en las coordenadas del usuario
                switch(cuadrante[x][y]){
                    case VACIO:
                    cuadrante[x][y]=INTENTO;
                    break;
                    case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir=true;
                    break;
                    case TESORO:
                    System.out.println("En hora buena, has encontrado el tesoro.");
                    salir=true;
                    break;
                    default:
                }
            } while(!salir);

            //pinta el cuadrante
            for(y=3;y>=0;y--){
                System.out.print(y + " |");
                for(x=0;x<5;x++){
                    switch(cuadrante[x][y]){
                        case VACIO:
                        c=" ";
                        break;
                        case MINA:
                        c="* ";
                        break;
                        case TESORO:
                        c="$ ";
                        break;
                        case INTENTO:
                        c="x ";
                        break;
                        default:
                    }
                    System.out.print(c);
                }
                System.out.println();
            }
        System.out.println("  -----------\n   0 1 2 3 4\n");
    }
}