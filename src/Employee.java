public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private  static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return
                "Ф.И.О." + fullName + '\'' +
                ", отдел № " + department +
                ", заработная плата = " + salary +
                ", id=" + id +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
