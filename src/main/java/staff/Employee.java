package staff;

public abstract class Employee {
    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

//    public double setSalary(Double salaryRevised){
//        if (salaryRevised < 0)
//            throw new IllegalArgumentException("Salary cannot be a negative number");
//        this.salary = salaryRevised;
//        return this.salary;}

    public double setSalary(Double salaryRevised){
        if (salaryRevised < 0)
            throw new IllegalArgumentException("Salary cannot be a negative number");
        this.salary = salaryRevised;
        return this.salary;}

    public double raiseSalary(Double bonusPercent){
        if (bonusPercent < 0)
            throw new IllegalArgumentException("Salary cannot be a negative number");
        Double increment = bonusPercent / 100;
        Double bonusAmount = this.salary * increment;
        return this.salary + bonusAmount;
    }

//    public double raiseSalary(Double bonusPercent){
//        Double increment = bonusPercent / 100;
//        Double bonusAmount = this.salary * increment;
//        return this.salary + bonusAmount;
//    }


    public double calcBonus(){
        return this.salary *0.01;
    }

    public double payBonus(Double parameter){
        return this.salary += parameter;

    }
}
