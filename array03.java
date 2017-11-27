//array con for
public class array03{
    public static void main(String[] args){
        int[] numero = new int[10];

        numero[0]=6;
        numero[1]=43;
        numero[2]=4;
        numero[3]=767;
        numero[4]=456;
        numero[5]=numero[0] * 10;
        numero[6]=numero[4]/numero[2];
        numero[7]=numero[1]+numero[3];
        numero[8]=numero[3]-numero[4];
        numero[9]=1323;

        for(int x=0;x<10;x++){
            System.out.print(numero[x] + " ");
        }
    }
}