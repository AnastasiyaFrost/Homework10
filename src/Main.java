public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Смирнов Артем Иванович", 3, 30_000);
        employees[2] = new Employee("Иванов Алексей Алексеевич", 3, 150_000);
        employees[3] = new Employee("Сидоров Петр Петрович", 4, 45_000);
        employees[4] = new Employee("Васильев Андрей Степанович", 2, 56_000);
        employees[5] = new Employee("Смирнов Иван Иванович", 5, 60_000);
        employees[6] = new Employee("Потапов Иван Ирсеньевич", 2, 30_000);
        employees[7] = new Employee("Чижиков Олег Семенович", 3, 43_000);
        employees[8] = new Employee("Ежиков Мариан Владимирович", 1, 62_000);
        employees[9] = new Employee("Башмачкин Акакий Акакиевич", 4, 55_000);


        printAllInfoAboutEmployees(employees);
        System.out.println("countSalarySum(employees) = " + countSalarySum(employees));
        System.out.println("findMinSalary(employees) = " + findMinSalary(employees));
        System.out.println("findMaxSalary(employees) = " + findMaxSalary(employees));

        printAllFullNames(employees);
        System.out.println("countAverageSalary(employees) = " + countAverageSalary(employees));
    }

    public static void printAllInfoAboutEmployees(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public static double countSalarySum(Employee[] employees) {
        double allSalarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalarySum = allSalarySum + employees[i].getSalary();
        }
        return allSalarySum;
    }

    public static double findMinSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double findMaxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static double countAverageSalary(Employee[] employees) {
        double averageSalary = countSalarySum(employees)/employees.length;
        return averageSalary;
    }

    public static void printAllFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника: " + employees[i].getFullName());
        }
    }
}