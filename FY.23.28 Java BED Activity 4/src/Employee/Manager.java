package Employee;
public class Manager extends Employee{
    private int numberOfReportees = 10;

    public void printDetails(){
        System.out.println("Id : " + getId());
        System.out.println("Name : " + getEname());
        System.out.println("Email : " + getEmail());
        System.out.println("Vacation Days : " + getVacationDays());
        System.out.println("Number of Reportees : " + getNumberOfReportees());
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

}
