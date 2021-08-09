/**
 * Write a description of class hgf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 /**
 * Write a description of class hgf here.
 *
 * @author (Sandip Gajurel)
 * @version (2020-1-13)
 */
/* FullTimeStaffHire class inherits StaffHire class*/
class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    /* The constructor take five parameters, three of which are inherited from StaffHire class*/
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour) {
        /* Variables designation, vacancyNumber and jobType are inherited from StaffHire class*/
        super(vacancyNumber, designation, jobType);
        /* Setting values for two of FullTimeStaffHire's own variables within the parameterized constructor */
        this.salary = salary;
        this.workingHour = workingHour;
        /* put values to other instance variables of the class */
        staffName = "";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
    }   
    
    /* Accessor methods for each attribute */
    /* This method also allows to set salary for vacant job and if the job is not vacant then it displays
         * a message that given staff has already joined. */
    public int setSalary(int salary) {        
        this.salary = salary;
        if (joined==false){
            this.salary = salary;
            joined = true;
        }
        else{
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        return salary;
    }
       
    public int getSalary() {
        return salary;
    }    
    
    /* This method is used to assign new working hourand also displays a message if a staff has 
     * already been appointed. */ 
    public int setWorkingHour(int workingHour) {
        if (joined==false){
            this.workingHour = workingHour;
        }else {
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        return workingHour;
    }
    
    public int getWorkingHour() {
        return workingHour;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffName() {
        return staffName;
    }
    
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }
    
    public String getJoiningDate() {
        return joiningDate;
    }   

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public String getQualification() {
        return qualification;
    }  

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }   
    
    public boolean getJoined() {
        return joined;
    }
    
    
    /* This is the method to hire full time staff for the organization. The method accepts
     * joining date, staff name, appointed by and qualification. If the Staff is already
     * appointed, an appropriate message including the join date and staff name are displayed. If 
     * the staff has not joined, the staff name, qualification, join date and appointed by are required
     * to update by the parameter values input to the method and the joining status of the staff is 
     * changed to true. */    
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == false){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println(this.getStaffName() + " is " + "already appointed.");
            System.out.println();
        }
    }

    /* This is the method to display the detail information of the staffs which are hired full time by an organization.
     * It has same signature as display method in StaffHire. It first calls the method in 
     * StaffHire to display its three attributes: vacancyNumber, jobType and designation. In 
     * addition its own attributes are also shown if the staff has already joined. */
    public void display(){
        if (joined==true){
        /* Calls display() from StaffHire class */
        super.display();
        /* displays its own attributes adding to the one that inherited from StaffHire */
        System.out.println("Staff Name: " + this.getStaffName());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Working Hour: " + this.getWorkingHour());
        System.out.println("Joining Date: " + this.getJoiningDate());
        System.out.println("Qualification: " + this.getQualification());
        System.out.println("Appointed By: " + this.getAppointedBy());
        System.out.println();
        }
    }
}
