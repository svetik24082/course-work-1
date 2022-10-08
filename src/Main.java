

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(" Мануйлова Наталья Валерьевна", 1, 45600);
        employees[1] = new Employee(" Макеева Марина Витальевна", 2, 38600);
        employees[2] = new Employee(" Быков Евгений Семенович", 3, 38650);
        employees[3] = new Employee(" Рядинская Мария Анатольевна", 4, 25000);
        employees[4] = new Employee(" Шиганова Ольга Василовна", 5, 28680);


        printAllEmployees();
        System.out.println(" Сумма всех зарплат состовляет " + calculateSumSalary());
        System.out.println( " Сотрудник с минимальной зарплатой " + getEmployeeWithMinSalary());
        System.out.println( " Сотрудник с максимальной зарплатой  " + getEmployeeWithMaxSalary());


    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) ;
            System.out.println(employee);


        }
    }

    public static int calculateSumSalary() {
        int sum = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }

        }
        return sum;

    }

    public static Employee getEmployeeWithMinSalary(){
     int min = Integer.MAX_VALUE;
     Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }


        return targetEmployee;
    }

    public static Employee getEmployeeWithMaxSalary() {
    int max = Integer.MIN_VALUE;
    Employee targetEmployee = null;
    for (Employee employee : employees) {
        if ( employee != null && employee.getSalary()> max){
            max = employee.getSalary();
            targetEmployee = employee;
        }
    }
        return targetEmployee;
    }}