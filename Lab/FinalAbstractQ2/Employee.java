package Lab.FinalAbstractQ2;
abstract class Employee {

    String name;
    public Employee(String name) {
        System.out.println("Employee constructor called");
        this.name = name;
    }
    abstract double calculateSalary();
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}