package basic.io_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class files {
    public static void main(String[] args) throws IOException {
        File fichero_prueba = new File("io_file\\hola_mundo.txt");
        fichero_prueba.createNewFile();
        System.out.println(fichero_prueba.getAbsolutePath());
        fichero_prueba.setWritable(true);
        BufferedWriter ficheriyo_escritor = new BufferedWriter(new FileWriter(fichero_prueba));
        ficheriyo_escritor.write("Marta es el amor de mi vida.");
        ficheriyo_escritor.close();
        BufferedReader ficheriyo_lector = new BufferedReader(new FileReader(fichero_prueba));
        String fila;
        while ((fila = ficheriyo_lector.readLine()) != null){
            System.out.println(fila);
        }
        ficheriyo_lector.close();
    }
}