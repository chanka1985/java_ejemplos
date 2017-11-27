//otra de array llenado por la entrada de teclado
public class array05{
    public static void main(String[] args){
        double[] nota= new double[4];
        int suma= 0;

        for(int x = 0;x<4;x++){
            System.out.println("Ingrese su nota N° " + (x+1) + " : ");
            nota[x]=Double.parseDouble(System.console().readLine());
        }

        System.out.println("Sus notas son : ");

        for(int i=0;i<4;i++){
            System.out.println(nota[i] + " ");
            suma += nota[i];
        }

        System.out.println("Su promedio es : " + suma/4);
    }
}