package OOP;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import OOP.clases.empleado;
import OOP.clases.persona;

public class oop {
    public static void main(String[] args) throws IOException {
        persona persona1 = new persona("Daniel", "Gonzalez Anwar", 1.72, 85.2, 25, 1997, 12, 21);
        empleado empleado1 = new empleado("Tarma", "Garcia Lorenzo", 1.75, 56, 28, 1995, 7, 12, 1, "Telecomunicaciones", 1);
        String ficheriyo = Paths.get("G:", "A miña unidade", "FORMACION", "DAM", "PROGRAMACION", "JAVA", "basic_java", "basic", "io_file", "personas.txt").toString();
        FileWriter ficheriyo_escritor = new FileWriter(ficheriyo);
        ficheriyo_escritor.write(empleado1.show_person_data());
        ficheriyo_escritor.write("\n\nTodos patos.\n");
        ficheriyo_escritor.write("\n");
        ficheriyo_escritor.write(persona1.show_person_data());
        ficheriyo_escritor.close();
        String tarma = System.console().readLine("Prueba: ", args);
        System.out.println(tarma);
        }
}