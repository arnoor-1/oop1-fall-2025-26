package Lab.FinalAbstractQ2;
class FullTimeEmployee extends Employee {

    double monthlySalary;
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        System.out.println("FullTimeEmployee constructor called");
        this.monthlySalary = monthlySalary;
    }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}