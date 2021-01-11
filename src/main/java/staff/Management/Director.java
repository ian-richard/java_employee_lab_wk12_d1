package staff.Management;

import staff.Employee;

public class Director extends Manager {

    private int budget;

    public Director(String name, int niNumber, int salary, String deptName, int budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

}
