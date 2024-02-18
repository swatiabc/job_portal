package com.portal.job.users;

import jakarta.persistence.*;

@Entity
@Table
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false, unique = true)
    private String phone_number;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private double current_salary;
    @Column(nullable = false)
    private double expected_salary;
    private String designation;
    private String current_org;

    public User (String first_name, String last_name, String phone_number, String email, double current_salary, double expected_salary, String designation, String current_org) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.current_salary = current_salary;
        this.expected_salary = expected_salary;
        this.designation = designation;
        this.current_org = current_org;
    }

    public User ( ) {
    }

    public long getId ( ) {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getFirst_name ( ) {
        return first_name;
    }

    public void setFirst_name (String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name ( ) {
        return last_name;
    }

    public void setLast_name (String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number ( ) {
        return phone_number;
    }

    public void setPhone_number (String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public double getCurrent_salary ( ) {
        return current_salary;
    }

    public void setCurrent_salary (double current_salary) {
        this.current_salary = current_salary;
    }

    public double getExpected_salary ( ) {
        return expected_salary;
    }

    public void setExpected_salary (double expected_salary) {
        this.expected_salary = expected_salary;
    }

    public String getDesignation ( ) {
        return designation;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }

    public String getCurrent_org ( ) {
        return current_org;
    }

    public void setCurrent_org (String current_org) {
        this.current_org = current_org;
    }

    @Override
    public String toString ( ) {
        return "User{}";
    }
}
