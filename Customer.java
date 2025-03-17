package Interfaces;

/**
 * @author Luis Duque
 * CEN 4010 RVF 1251
 * PID: 6410684
 * This is the Customer Object Class
 */

public class Customer extends User{
    private int custID;
    private String custName = "";
    private String custEmail;
    private int custPhoneNum;

    Customer() {
        custID = 0;
        custName = "";
        custEmail = "";
        custPhoneNum = 0;
    }

    Customer(int custID, String custName, String custEmail, int custPhoneNum) {
        this.custID = custID;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhoneNum = custPhoneNum;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public int getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(int custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custEmail='" + custEmail + '\'' +
                ", custPhoneNum=" + custPhoneNum +
                '}';
    }
}
