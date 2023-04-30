package employeedemo;

public class Employee {
    private String name;
    private int eid;
    private String designation;
    private int age;
    public Employee(){
        
    }
    public Employee(String name, int eid, String designation, int age) {
        this.name = name;
        this.eid = eid;
        this.designation = designation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
