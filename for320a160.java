// escribir numeros de 320 a 160 de 20 en 20 con bucle for
class for320a160{
    public static void main(String[] args){
        int x = 0;
        for(x = 320;x >= 160;x--){
            if(x % 20 == 0){
                System.out.println(x + " ");
            }
        }
    }
}