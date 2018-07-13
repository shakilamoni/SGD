package com.sgd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @NotEmpty(message = "email address")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "Password")
    private String password;

    @Column(name = "password_match")
    @NotEmpty(message = "Please confirm your password")
    private String passwordMatch;

    @Column(name = "first_name")
    @NotEmpty(message = "First name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Last name")
    private String lastName;

    @Column(name = "age")
    @NotEmpty(message = "Age")
    private short age;

    @Column(name = "gender")
    @NotEmpty(message = "Gender")
    private String gender;

    @Column(name = "ethnicity")
    @NotEmpty(message = "Ethnicity")
    private String ethnicity;

    @Column(name = "pin")
    @NotEmpty(message = "Pease enter a six digit pin")
    private short pin;

    @Column(name = "pin_match")
    @NotEmpty(message = "Please confirm your pin")
    private short pinMatch;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "confirmation_token")
    private String confirmationToken;

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordMatch() {
        return passwordMatch;
    }

    public void setPasswordMatch(String passwordMatch) {
        this.passwordMatch = passwordMatch;
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public short getPin() {
        return pin;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }

    public short getPinMatch() {
        return pinMatch;
    }

    public void setPinMatch(short pinMatch) {
        this.pinMatch = pinMatch;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean value) {
        this.enabled = value;
    }
}
