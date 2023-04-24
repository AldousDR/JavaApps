
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String position;

    public Employee() {
        this.id = 1;
        this.firstName = "Aldous";
        this.lastName = "Delos Reyes";
        this.department = "ATCP";
        this.position = "ASE";
    }


    public Employee(int id, String firstName, String lastName, String department, String position){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
    }

    public void printDetails(){
        System.out.println("ID: " + this.getId());
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name: " + this.getLastName());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Position: " + this.getPosition());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
