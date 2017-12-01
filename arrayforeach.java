//Utilizando foreach para recorrer arrays

public class arrayforeach{
    public static void main(String[] args){
        
        double[] nota = new double[4];
        
        System.out.println("Para calcular la nota promedio necesito saber la");
        System.out.println("nota de cada uno de tus examenes.");

        for(int x = 0;x<4;x++){
            System.out.print("Nota de examen N° "+ (x+1)+ ": ");
            nota[x] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");

        double suma = 0;

            for(double n : nota){
                System.out.print(n + " ");
                suma+=n;
            }
        System.out.println("\nTu nota promedio es : " +(suma/4));
    }
}