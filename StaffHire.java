   /**
 * Write a description of class hgf here.
 *
 * @author (Sandip Gajurel)
 * @version (2020-1-13)
 */

   class StaffHire{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    /* create of the parameterized constructor Staffhire with three parameters they are vacancyNumber, designation and jobType*/
    public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber; 
        /*here is the keyword which is used  for all variable because we have used same variable name like parameter and instance variables*/
        this.designation = designation;
        this.jobType = jobType;
    }
    
    /*Create of accessor (getter and setter) methods for all variables of program*/
    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }
    
    public int getVacancyNumber() {
        return vacancyNumber;
    }

      public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getDesignation() {
        return designation;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    public String getJobType() {
        return jobType;
    }
    
    /* show method for the StaffHire class variables - this method will be later inherited by PartTimeStaffHire and FullTimeStaffHire classes*/
    public void display(){
        System.out.println("Vacancy Number: "+ this.getVacancyNumber());
        System.out.println("Designation: "+ this.getDesignation());
        System.out.println("Job Type: "+ this.getJobType());
    }
}