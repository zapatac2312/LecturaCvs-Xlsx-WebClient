package com.example.demo.modelo;

import org.springframework.stereotype.Component;

@Component
public class cvsDocument {
    private String usedId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phone;
    private String dateOfBirth;
    private String jobTittle;

    public cvsDocument(String usedId, String firstName, String lastName, String gender, String email,  String phone, String dateOfBirth, String jobTittle) {
        this.usedId = usedId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.jobTittle = jobTittle;
        this.phone = phone;
    }

    public cvsDocument() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsedId() {
        return usedId;
    }

    public void setUsedId(String usedId) {
        this.usedId = usedId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

}
