package officeinfo;

public class People {

    private String name;
    private int age;
    private String occupation;
    private String ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public People(String name, int age, String occupation, String ID) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.ID = ID;
    }
    public void display(){
        System.out.println("Name "+this.name);
        System.out.println("Age "+this.age);
        System.out.println("Occupatioin"+ this.occupation);
        System.out.println("ID "+this.ID);
    }
    

}
