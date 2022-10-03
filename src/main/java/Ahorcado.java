import java.util.Objects;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        metodos();
    }

    public static void metodos(){
        String [] palabras = {"estoy", "pensando", "en", "que", "palabras", "usar", "para", "el", "proyecto", "ahorcado"};

        int numeroDeVidas = 10;

        String [] palabra = seleccionarPalabra(palabras);
        largo(palabra);

        String letra = recibirLetra(palabra, numeroDeVidas);
        esSoloLetras(letra);

        comparar(letra, palabra, numeroDeVidas);
    }

    public static String [] seleccionarPalabra(String [] palabras){
        int numAleatorio = (int)(Math.random()*10);
        String [] palabra = new String[1];
        for (int i = 0; i < numAleatorio; i++){
            palabra [0] = palabras[i];
        }
        return palabra;
    }

    public static void largo (String [] palabra){
        int largoDeLaPalabra = palabra.length;
        System.out.println("El tamaño de la palabra a adivinar es: " + largoDeLaPalabra);
        System.out.println(palabra);
    }

    static boolean esSoloLetras(String letra) {
        for (int i = 0; i < letra.length(); i++) {
            char caracter = letra.toLowerCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 164 && (valorASCII < 97 || valorASCII > 122))
                return false;
        }
        return true;
    }

    public static String recibirLetra(String [] palabra, int numeroDeVidas){
        Scanner teclado = new Scanner(System.in);
        String letra = " ";

        do {
            System.out.println("Introduzca una letra:");
            letra = teclado.next();

            if (esSoloLetras(letra)){
                System.out.println("");
            } else {
                System.out.println("La letra contiene carácteres No válidos. Inténtelo de nuevo.");
            }

            comparar(letra, palabra, numeroDeVidas);

        } while (letra.length() > 1 && numeroDeVidas > 0);

        return letra;
    }

    public static boolean comparar (String letra, String [] palabra, int numeroDeVidas){
        for (int i = 0; i < palabra.length; i++){
            if (Objects.equals(letra, palabra[i])){
                System.out.println(letra + " es igual a " + palabra[i]);
            } else {
                numeroDeVidas = numeroDeVidas - 1;
                vidas(numeroDeVidas);
                return false;
            }
            System.out.println("Tus vidas actuales son" + numeroDeVidas);
        }
        return true;
    }

    public static void vidas(int numeroDeVidas){
        if (numeroDeVidas == 0){
            System.out.println("Las vidas se agotaron.");
            System.out.println("Finalizando el programa.");
            System.exit(0);
        }
    }

/*
    public static void mostrarPalabras(String [] palabras){
        for (int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
*/

    //primer commit 10 palabras

    //segundo commit programa listo
}
