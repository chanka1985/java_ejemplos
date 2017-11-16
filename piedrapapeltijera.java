// aplicacion que simula el juego piedra papel o tijera
public class piedrapapeltijera{
    public static void main(String[] args){
        for(int i = 0;i < 21;i++){
        int j = (int)(Math.random()*3);

        switch(j){
            case 0:
            System.out.println("Piedra");
            break;
            case 1:
            System.out.println("Papel");
            break;
            case 2:
            System.out.println("Tijera");
            break;
            default:
            System.out.println("error de mano jejejeje");
        }
        }
    }
}