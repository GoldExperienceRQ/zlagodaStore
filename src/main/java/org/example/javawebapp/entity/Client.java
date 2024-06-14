package org.example.javawebapp.entity;

public class Client {
    private String clientNumber;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private String street;
    private String index;
    private String phone;
    private int percent;

    public Client(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public Client(String clientNumber, String name, String surname, String patronymic, String city, String street, String index, String phone, int percent) {
        this.clientNumber = clientNumber;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.city = city;
        this.street = street;
        this.index = index;
        this.phone = phone;
        this.percent = percent;
    }

    public String getClientNumber() {
        return clientNumber;
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
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getIndex() {
        return index;
    }
    public String getPhone() {
        return phone;
    }
    public int getPercent() {
        return percent;
    }

}
