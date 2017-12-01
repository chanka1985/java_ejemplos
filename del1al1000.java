//Programa que cuenta del 1 al 1000
public class del1al1000{
    public static void main(String[] args) throws InterruptedException{

        for(int x = 1;x<=1000;x++){
            if(x%10==0){
                System.out.print(x + ", ");
                }
                Thread.sleep(15);
        }
    }
}