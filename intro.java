//programita para captura de texto dede el teclado
class intro{
    public static void main(String[] args){
        String nombre;
        System.out.print("Introduce tu nombre: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + " , encantado de conocerte.");
    }
}