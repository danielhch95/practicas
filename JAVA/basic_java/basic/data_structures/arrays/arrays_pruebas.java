package arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class arrays_pruebas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas_newarray = entrada.nextInt();
        int columnas_newarray = entrada.nextInt();
        entrada.close();
        int[][] newarr = new int [filas_newarray][columnas_newarray];
        int[] array_simple = new int[3];
        int[] array_prueba = new int[3];
        Array.set(array_prueba, 1, 45);
        Array.setInt(array_simple, 1, 5);

        for (int i=0;i<array_prueba.length;i++){
            System.out.println(array_prueba[i]);
        }
        for (int i=0;i<array_simple.length;i++){
            System.out.println(array_simple[i]);
        }

        for (int f=0;f<newarr.length;f++){
            for (int c=0;c<newarr.length;c++){
                System.out.println(newarr[f][c]);
            }
        }
    }
}