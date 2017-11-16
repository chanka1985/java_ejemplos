//se muestran 20 numeros aleatorios de 0 a 10
public class aleatorio20{
    public static void main(String[] args){
        for(int x = 0;x<21;x++){
            int valores = (int)(Math.random()*11);
            System.out.print(valores + " ");
        }
    }
}