//Array de 10 elementos formado por caracteres

public class arrayex02{
    public static void main(String[] args){

        char[] simbolo = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        int c = 0;

        for(char letra:simbolo){
            System.out.println("simbolo["+ c + "] = " + letra);
            c+=1;
        }
    }
}