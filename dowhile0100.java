//programando de 0 a 100 con do while
class dowhile0100{
    public static void main(String[] args){
        int x = 0;

        do{
            x +=1;
            if(x % 5 == 0){
                System.out.println(x + " ");
            }
        }while(x <= 100);
    }
}