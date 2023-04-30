package employeedemo;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee("Miftah",127,"Sweeper",57);
        emp[1] = new Employee("Misbah",135,"Teacher",48);
        emp[2] = new Employee("Shawon",148,"Lecturer",38);
        emp[3] = new Employee("Talha",159,"Teacher",48);
        emp[4] = new Employee("Jawad",114,"Lecturer",29);
        Employees empAr = new Employees(emp);
        System.out.println(empAr.find(148).getName());
    }
    
}
