
public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    /* Construct with six parameters in which three are inheritate from StaffHire superclass */
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts) {
        /* vacancyNumber,jobType and Variables designation are inherited from StaffHire class*/
        super(vacancyNumber, designation, jobType);
        /* make values from parameter to own variables */
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        /* put values to other variables from own class */
        staffName="";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }

    //Accessor methods
    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    
    public int getWorkingHour() {
        return workingHour;
    }
  
    public void setWagesPerHour(int wagesPerHour) {
        this.wagesPerHour = wagesPerHour;
    }

    public int getWagesPerHour() {
        return wagesPerHour;
    }
    
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    
    public String getStaffName() {
        return staffName;
    }
  
    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        
        if (joined==false){
          this.shifts = shifts;
          joined = true;
        }
        else{
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        
    }

    public boolean getjoined() {
        return joined;
    }

    public void setjoined(boolean joined) {
        this.joined = joined;
    }

    public boolean getTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }

    /* The method described below is a method to hire part time staff for an organization. The method accepts
     * joining date, staff name, qualification and appointed by. If the Staff is already
     * appointed, an appropriate information including the staff name and join date are
     * shown. If the staff has not joined, the join date, qualification,the staff name
     * appointed by are required to update by the parameter values input to the method
     * and the joining status of the staff is changed to true and current status of the
     * staff is changed to false. */
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == false){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
    }

    /* This is a method to bring the end of the staff. If the staff is already terminated, a
      suitable information is displayed. Else, join date, staff name, appointed by, qualification,
      are set to an empty string. like above, the joined status is set to false
      while the terminated status is changed to true. */
    public void terminatePartTimeStaff(){
        if(terminated==true){
            System.out.println("Staff is already terminated");
        } else {
            terminated = true;
            joined = false;
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
        }
    }
    
    /* This is the method to show the details information of the staffs hired part time by an organization.
     * It has same signature as the display method in StaffHire. It calls first the method display()
     * in StaffHire to show its three attributes: designation, vacancyNumber and jobType. In 
     * addition its own attributes are also shown if the staff has joined. */
    public void display(){
        if (joined==true){
            /* Calls display() from StaffHire class */
            super.display();
            /* Displays its own attributes adding to the ones displayed from the method called above */
            System.out.println("Staff Name: " + this.getStaffName());
            System.out.println("Wages per hour: " + this.getWagesPerHour());
            System.out.println("Working Hour: " + this.getWorkingHour());
            System.out.println("Joining Date: " + this.getJoiningDate());
            System.out.println("Qualification: " + this.getQualification());
            System.out.println("Appointed By: " + this.getAppointedBy());
            System.out.println("Income per day: "+ (this.getWorkingHour()*getWagesPerHour()));
            System.out.println();
        }
    }
}
