/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1;

/**
 *
 * @author basal
 */
public class Doctor extends Worker {
    
    private String specialization;
    private String rise; //Прибавка к зарплате (ковидная прибавка)
    private int overWork; //Переработка в часах

    //Construct

    public Doctor(String specialization, String rise, int overWork, int salary, String workSchedule, int workHours, String jobName, String name, String birthDate, String country) {
        super(salary, workSchedule, workHours, jobName, name, birthDate, country);
        this.specialization = specialization;
        this.rise = rise;
        this.overWork = overWork;
    }

    public Doctor(String specialization, String rise, int overWork, int salary, String workSchedule, int workHours, String jobName, String name, String birthDate) {
        super(salary, workSchedule, workHours, jobName, name, birthDate);
        this.specialization = specialization;
        this.rise = rise;
        this.overWork = overWork;
    }

    public Doctor(String specialization, String rise, int overWork, int salary, String workSchedule, int workHours, String jobName, String name) {
        super(salary, workSchedule, workHours, jobName, name);
        this.specialization = specialization;
        this.rise = rise;
        this.overWork = overWork;
    }
    
    //Voids
    
    public void overWork() {
        if (overWork == 1 || overWork == 0) {
            System.out.println("You've overworked " + overWork + " hour");
        }
        else {
            System.out.println("You've overworked " + overWork + " hours");
        }
    }
    
    public void extraPaid() {
        System.out.println("You've been paid for your extrawork. You've earned ");
        System.out.println(overWork*salary);
    }
    
    public void carePeople() {
        System.out.println("You've treated a person");
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + getName() + ", birthDate=" + getBirthDate() + ", country=" + getCountry() + "salary=" + getSalary() + ", workSchedule="
                + getWorkSchedule() + ", workHours=" + getWorkHours() + ", jobName=" + getJobName() + "specialization=" + specialization + ", rise=" + rise + ","
                + " overWork=" + overWork + '}';
    }
    
    
}
