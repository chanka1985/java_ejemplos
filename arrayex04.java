//Tres arrays de 20 valores
public class arrayex04{
    public static void main(String[] args){
        //Declarando los tres arrays
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        //Llenando los arrays
        for(int n = 0;n < 20;n++){
            numero[n] = (int)(Math.random()*101);
            cuadrado[n] = numero[n] * numero[n];
            cubo[n] = cuadrado[n] * numero[n];
        }

        for(int d = 0;d < 20;d++){
            System.out.println(numero[d]+ "   " + cuadrado[d]+ "   " + cubo[d]);
        }
    }
}