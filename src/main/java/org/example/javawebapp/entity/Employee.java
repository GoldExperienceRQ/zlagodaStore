package org.example.javawebapp.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String surname;
    private String patronymic;
    private double salary;
    private String role;
    private String dateOfStart;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String street;
    private String index;


    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String name, String surname, String patronymic,  String role, double salary, String dateOfStart, String dateOfBirth, String phoneNumber, String city, String street, String index) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.role = role;
        this.dateOfStart = dateOfStart;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.street = street;
        this.index = index;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public double getSalary() {
        return salary;
    }
    public String getRole() {
        return role;
    }
    public String getDateOfStart() {

        return dateOfStart;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getIndex() {
        return index;
    }



}
