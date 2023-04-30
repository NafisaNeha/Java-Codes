
package employeedemo;

public class Employees {
    private Employee emp[];

    public Employees(Employee[] emp) {
        this.emp = emp;
    }

    public Employee[] getEmp() {
        return emp;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }
    
    public Employee find(String name){
        for(int i=0;i<emp.length;i++){
            if(emp[i].getName().equals(name)){
                return emp[i];
            }
        }
        System.out.println("Error:Employee not found");
        return new Employee();
    }
    public Employee find(int eid){
        for(int i=0;i<emp.length;i++){
            if(emp[i].getEid()==eid){
                return emp[i];
            }
        }
        System.out.println("Error:Employee not found");
        return new Employee();
    }
    public Employee find(String designation,int age){
        for(int i=0;i<emp.length;i++){
            if(emp[i].getDesignation().equals(designation) && emp[i].getAge()==age){
                return emp[i];
            }
        }
        System.out.println("Error:Employee not found");
        return new Employee();
    }
}
