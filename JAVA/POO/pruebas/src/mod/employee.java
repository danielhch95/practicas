package mod;

import java.util.Date;
import java.util.GregorianCalendar;

public class employee {
    private static int id_to_assign =1;
    private final int employee_id;
    private String first_name;
    private String last_name;
    private String role;
    private String department;
    private int category;
    private final Date day_joined;

    public employee(String first_name, String last_name, String role, String department, int category){
        this.employee_id = id_to_assign;
        id_to_assign++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.department = department;
        this.category = category;
        GregorianCalendar joined_day = new GregorianCalendar();
        this.day_joined = joined_day.getTime();
    }
    public employee(String first_name, String last_name, String role, String department){
        this(first_name, last_name, role, department, 1); /* Por defecto le da el valor 1 si no se especifica */
    }
    public String show_emp_data(){
        return "Employee id: " + employee_id + "\nFirst Name: " + first_name + "\nLast Name: " + last_name + "\nRole: " + role + "\nCategory: N" + category + "\nDepartment: " + department + "\nDay joined: " + day_joined;
    }
    public void modif_emp_category(int category){
        this.category = category;
    }
    public static int next_id(){
        return id_to_assign;
    }
}