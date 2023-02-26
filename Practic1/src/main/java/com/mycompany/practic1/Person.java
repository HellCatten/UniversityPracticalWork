/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1;

/**
 *
 * @author basal
 */
public class Person {
    
    private String name;
    private String birthDate;
    private String country;
    
    //Конструкторы
    
    public Person(String name,String birthDate,String country) {
        this.name = name;
        this.birthDate = birthDate;
        this.country = country;
    }

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String name) {
        this.name = name;
    }
 
    //Войды
    
    public void sleep() {
        System.out.println("Person goes to sleep");
    }
    
    public void eat() {
        System.out.println("Person is eating");
    }
    
    public void shits() {
        System.out.println("Person is taking a shit");
    }
    
    public void haveFun() {
        System.out.println("Person is having fun minding its own business");
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthDate=" + birthDate + ", country=" + country + '}';
    }

}
