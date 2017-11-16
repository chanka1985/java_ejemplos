// clase que muestra como funciona la funcion Math.random()

public class aleatorio{
    public static void main(String[] args){
        for(int i = 1;i < 21;i++){
            System.out.print((int)(Math.random()*11+50)+ " ");
        }
    }
}