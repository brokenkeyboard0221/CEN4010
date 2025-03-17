package Interfaces;

/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * This is the Worker Object class
 */

public class Worker extends User{
    private int workID;
    private String workName;
    private String workEmail;
    private int workPhoneNum;
    private double workRating;

    public Worker() {
        workID = 0;
        workName = "";
        workEmail = "";
        workPhoneNum = 0;
        workRating = 0.0;
    }

    public Worker(int workID, String workName, String workEmail, int workPhoneNum,  double workRating) {
        this.workID = workID;
        this.workName = workName;
        this.workEmail = workEmail;
        this.workPhoneNum = workPhoneNum;
        this.workRating = workRating;
    }

    public double getWorkRating() {
        return workRating;
    }

    public void setWorkRating(double workRating) {
        this.workRating = workRating;
    }

    public int getWorkPhoneNum() {
        return workPhoneNum;
    }

    public void setWorkPhoneNum(int workPhoneNum) {
        this.workPhoneNum = workPhoneNum;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }
}
