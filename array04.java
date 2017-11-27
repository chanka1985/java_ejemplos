//array de caracteres
public class array04{
    public static void main(String[] args){

        char[] caracter = new char[7];

        caracter[0]='A';
        caracter[1]='_';
        caracter[2]='=';
        caracter[3]='#';
        caracter[4]='@';
        caracter[5]='r';
        caracter[6]='|';

        for(int i=0;i<7;i++){
            System.out.print(caracter[i]+ " ");
        }
    }
}
