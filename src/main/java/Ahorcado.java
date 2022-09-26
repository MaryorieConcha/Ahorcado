import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        metodos();
    }

    public static void metodos(){
        String [] palabras = crearArreglo();
        //mostrarPalabras(palabras);
        String palabra = seleccionarPalabra(palabras);
        recibirLetra(palabra);
    }

    public static String [] crearArreglo(){
        String [] palabras = {"estoy", "pensando", "en", "que", "palabras", "usar", "para", "el", "proyecto", "ahorcado"};
        return palabras;
    }

    public static String seleccionarPalabra(String [] palabras){
        int numAleatorio = (int)(Math.random()*10);
        String palabra = "";
        for (int i = 0; i < numAleatorio; i++){
            palabra = palabras[i];
        }
        return palabra;
    }

    public static String recibirLetra(String palabra){
        Scanner leer = new Scanner(System.in);
        String letra = "";
        for (int i = 0; i < palabra.length(); i++){
            letra = leer.next();
        }
        return letra;
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
