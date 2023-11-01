package OOP.clases;

public class cliente extends persona {
    protected String CIF;
    protected String direccion;

    public cliente(String name, String surname, double height, double weight, int age, int year, int month, int day, String CIF, String direccion){
        super(name, surname, height, weight, age, year, month, day);
        this.CIF = CIF;
        this.direccion = direccion;
    }
    
}
