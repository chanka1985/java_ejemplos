// programa que lanza tres dados y suma el resultado
public class dados{
    public static void main(String[] args){
        int dado;
        int resultado = 0;
        for(dado = 1; dado < 4;dado++){
            int dados = (int)((Math.random()*6)+1);
            resultado += dados;
        }
        System.out.print(resultado);
    }
}