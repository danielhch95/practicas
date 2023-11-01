package OOP.clases;

public class empleado extends persona implements datos_clave{
    private String department;
    private int category;
    private int id_employee;

    public empleado(String name, String surname, double height, double weight, int age, int year, int month, int day, int id_employee, String department, int category){
        super(name, surname, height, weight, age, year, month, day);
        this.department = department;
        this.category = category;
    }
    @Override
    public String show_data(){
        return "ID Empleado: " + id_employee + "\nNombre completo: " + this.name + " " + this.surname + "\nDepartamento: " + department + "\t Categoría: " + category;
    }
}