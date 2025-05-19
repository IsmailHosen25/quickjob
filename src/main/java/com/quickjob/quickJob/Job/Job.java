package com.quickjob.quickJob.Job;


import com.quickjob.quickJob.Company.Company;
import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;

    @ManyToOne
    private Company company;
    // Constructors
    public Job() {}

    public Job(Long id, String title, String description, String location, Double salary, Company company) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.salary = salary;
        this.company = company;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}