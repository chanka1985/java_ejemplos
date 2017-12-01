//ejercicio de crear array con 12 numeros
public class arrayex01{
    public static void main(String[] args){

        int[] num = new int[12];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        int y=0;

        for(int x : num){
            System.out.println("num["+y+"] = " + x + " ");
            y+=1;
        }
    }
}