package basic.OOP.clases;

import java.time.LocalDate;

interface datos_clave {
    public String show_data();
}

public class persona {

    protected String name, surname;
    protected double height;
    protected double weight;
    protected int age;
    protected LocalDate fecha_nacimiento;

    public persona(String name, String surname, double height, double weight, int age, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.fecha_nacimiento = LocalDate.of(year, month, day);
    }
    public String show_person_data(){
        return "Nombre: " + name + "\nApellidos: " + surname + "\nage: " + age + "\nheight: " + height + "\nPeso: " + weight + "\nFecha de nacimiento: " + fecha_nacimiento;
    }
}