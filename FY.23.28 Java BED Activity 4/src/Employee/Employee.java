package Employee;

public class Employee {

    private int id = 101234;
    private String ename = "John Peter";
    private String email = "john.peter@accenture.com";
    private int vacationDays = 20;


    public void printDetails(){
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getEname());
        System.out.println("Email : " + getEmail());
        System.out.println("Vacation Days : " + getVacationDays());
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
