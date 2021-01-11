package staff.Management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int niNumber, int salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDept(){
        return this.deptName;
    }
}
