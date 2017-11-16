// programa que genera aleatoriamente un numero del 1 al 7 y lo asocia a un dia de la semana
public class semana{
    public static void main(String[] args){
        for(int i = 0;i < 21;i++){
            int j =(int)((Math.random()*7+1));
            switch(j){
                case 1:
                System.out.println("Lunes");
                break;
                case 2:
                System.out.println("Martes");
                break;
                case 3:
                System.out.println("Miercoles");
                break;
                case 4:
                System.out.println("Jueves");
                break;
                case 5:
                System.out.println("Viernes");
                break;
                case 6:
                System.out.println("Sábado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
                default:
                System.out.println("Error en random");
            }
        }
    }
}