//programa que genera los multiplos de 5 de 0 a 100

class while_0a100{
    public static void main(String[] args){
        int x = 0;
        while(x <= 100){
            x +=1;
            if(x % 5 == 0){
                System.out.println(x + " ");
            }
        }
    }
}