import javax.swing.JOptionPane;

import mod.employee;
import mod.level1;

public class App {
    public static void main(String[] args){
        employee[] employees = new employee[4];
        level1[] level1_employees = new level1[2];

        employees[0] = new employee("Daniel", "Herranz Chenlo", "NetOps", "Telecomunicaciones", 1);
        employees[1] = new employee("Yago", "Gil Pita", "NetOps", "Telecomunicaciones", 1);
        employees[2] = new employee("Daniel", "González Anwar", "NetOps", "Telecomunicaciones", 1);
        employees[3] = new employee("Victor", "Sánchez", "NetOps", "Telecomunicaciones");

        level1_employees[0] = new level1("Saúl", "González Blanco", "NetOps", "Telecomunicaciones", 1, 20000, true, false);
        level1_employees[1] = new level1("Nahuel", "Pardomo González", "NetOps", "Telecomunicaciones", 1, 22000, false, true);

        for (employee e: employees){
            JOptionPane.showMessageDialog(null, e.show_emp_data() + "\n");
        }

        for (level1 l1: level1_employees){
            System.out.println(l1.show_emp_data());
        }
    }
}