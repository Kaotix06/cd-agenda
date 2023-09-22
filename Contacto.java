package com.campusdual.agenda;

import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private String name;
    private String surname;
    private String city;
    private Integer zipCode;
    private List<String> phoneList = new ArrayList<>();
    private String mainNumber;
    private String dni;

    public Contacto(String name, String surname, String city, Integer zipCode, String dni) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.zipCode = zipCode;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public void setMainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public void addNumber(String number) {
        this.getPhoneList().add(number);
        if (this.getMainNumber() == null){
            this.setMainNumber(number);
        }
    }

    public void phoneCall(Contacto ctc) {
        System.out.println(this.getName() + " " + this.getSurname() + " esta llamando a " + ctc.getName() + " " + ctc.getSurname() + " " + ctc.getMainNumber());
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


}
