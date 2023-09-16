package mod;

public class level1 extends employee{
    private int salary;
    private boolean turns;
    private boolean senior;

    public level1(String first_name, String last_name, String role, String department, int category, int salary, boolean turns, boolean senior){
        super(first_name, last_name, role, department, category);
        this.salary = salary;
        this.turns = turns;
        this.senior = senior;
    }

    public String show_emp_data(){
        String turnicity;
        String seniority;
        if (turns == true){
            turnicity = " Yes.";
            if (senior == true){
                seniority = " Yes.";
            }
            else{
                seniority = " No.";
            }
        }
        else{
            turnicity = " No.";
            if (senior == true){
                seniority = " Yes.";
            }
            else{
                seniority = " No.";
            }
        }
        return super.show_emp_data() + "\nSalary: " + salary + "." + "\nTurnicity: " + turnicity + "\nSeniority: " + seniority;
    }
}