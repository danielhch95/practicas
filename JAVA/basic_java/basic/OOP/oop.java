package basic.OOP;

import basic.OOP.clases.empleado;
import basic.OOP.clases.persona;

public class oop {
    public static void main(String[] args) {
        persona persona1 = new persona("Daniel", "González Anwar", 1.75, 85.2, 25, 1997, 12, 21);
        System.out.println(persona1.show_person_data());
        empleado empleado1 = new empleado("Tarma", "García Lorenzo", 1.67, 56, 28, 1995, 7, 12, 1, "Telecomunicaciones", 1);
        System.out.println(empleado1.show_data());
        System.out.println(empleado1.show_person_data());
    }
}