package com.example.dynamiccards;

public class LuggageCollectModel {

    private String sno, employeeName, employeeID, mobileNumber, tokenNumber, remarks;

    /**
     * @param sno : unique serial no. of each field
     * @param employeeName : name of employee
     * @param employeeID: emplyee id
     * @param mobileNumber: mobile number of employee
     * @param tokenNumber: token number
     */
    public LuggageCollectModel(String sno, String employeeName, String employeeID, String mobileNumber, String tokenNumber) {
        this.sno = sno;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.mobileNumber = mobileNumber;
        this.tokenNumber = tokenNumber;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
