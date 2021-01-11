package staff.Management;

import staff.Employee;

public class Director extends Manager {

    private Double budget;

    public Director(String name, int niNumber, int salary, String deptName, Double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget(){
        return this.budget;
    }

}
