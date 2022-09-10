public class Employee {
    private int id;
    private static int counter = 0;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {return this.fullName;}
    public int getDepartment() {return this.department;}
    public double getSalary() {return this.salary;}
    public void setDepartment(int department) {this.department=department;}
    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Сотрудник " +
                " с именем " + fullName +
                " состоит в отделе " + department +
                " и имеет зарплату " + salary +
                ". Код сотрудника: " + id + ".";
    }

}
