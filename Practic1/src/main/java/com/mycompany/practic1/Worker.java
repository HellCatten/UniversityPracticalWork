/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1;

/**
 *
 * @author basal
 */
public class Worker extends Person {
    
    int salary; //Salary per hour
    private String workSchedule;
    private int workHours;
    private String jobName;

    //Конструкторы

    public Worker(int salary, String workSchedule, int workHours, String jobName, String name, String birthDate, String country) {
        super(name, birthDate, country);
        this.salary = salary;
        this.workSchedule = workSchedule;
        this.workHours = workHours;
        this.jobName = jobName;
    }

    public Worker(int salary, String workSchedule, int workHours, String jobName, String name, String birthDate) {
        super(name, birthDate);
        this.salary = salary;
        this.workSchedule = workSchedule;
        this.workHours = workHours;
        this.jobName = jobName;
    }

    public Worker(int salary, String workSchedule, int workHours, String jobName, String name) {
        super(name);
        this.salary = salary;
        this.workSchedule = workSchedule;
        this.workHours = workHours;
        this.jobName = jobName;
    }
    
    
    
    //Войды
    
    public void goToWork() {
        System.out.println("A worker is on a ride to his work");
    }
    
    public void doTheWork () {
        System.out.println("Worker is working and waiting the end of the workday (Hell)");
    }
    
    public void lunchAtWork () {
        System.out.println("Worker is having a lunch");
    }
    
    public void getPaid () {
        System.out.println("Woker is getting paid for his job");
        System.out.println("Your today's Salary is " + (this.salary*workHours));
    }

    public int getSalary() {
        return salary;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getJobName() {
        return jobName;
    }

    
    
    @Override
    public String toString() {
        return "Worker{" + "name=" + getName() + ", birthDate=" + getBirthDate() + ", country=" + getCountry() + "salary=" + salary + ", workSchedule="
                + workSchedule + ", workHours=" + workHours + ", jobName=" + jobName + "}";
    }
    
    
    
}
