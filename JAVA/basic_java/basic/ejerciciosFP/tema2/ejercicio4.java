package ejerciciosFP.tema2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter(" ");
        System.out.println("Token1: " + entrada.next());
        System.out.println("Token2: " + entrada.next());
        System.out.println("Token3: " + entrada.next());
        entrada.useDelimiter("\n");
        System.out.println("Token4: " + entrada.next());
        String patronsito = "Hola buenas colegas";
        entrada = new Scanner(patronsito);
        entrada.useDelimiter(" ");
        System.out.println("Token55: " + entrada.next());
        System.out.println("Token56: " + entrada.next());
        System.out.println("Token57: " + entrada.next());
    }
}
