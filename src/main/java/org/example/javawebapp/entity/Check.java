package org.example.javawebapp.entity;

public class Check {
    private String checkNumber;
    private String employeeId;
    private String clientId;
    private String printDate;
    private double sum;
    private double vat = 20;

    public Check(String checkNumber){
        this.checkNumber = checkNumber;
    }

    public Check(String checkNumber, String employeeId, String clientId, String printDate, double sum) {
        this.checkNumber = checkNumber;
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.printDate = printDate;
        this.sum = sum;
    }

    public String getCheckNumber() {
        return checkNumber;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public String getClientId() {
        return clientId;
    }
    public String getPrintDate() {
        return printDate;
    }
    public double getSum() {
        return sum;
    }
    public double getVat() {
        return vat;
    }
}
