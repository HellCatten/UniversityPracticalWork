/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1;

import java.util.Scanner;

/**
 *
 * @author basal
 */
public class Practic1 {

    public static void main(String[] args) {
        
        System.out.println("Практическая работа 1.4");
        System.out.println("Басалыков Иван РИБО-02-21");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose your Authorization path. To enter as a person print '1'. To enter as a Worker - print '2'. To enter as a doctor - print '3' ");
        int objectCheck = scan.nextInt();
        
        if (objectCheck == 1) {
            
            System.out.println("Print your Name");
            String name = scan.next();
            System.out.println("Print your birthdate");
            String birthDate = scan.next();
            System.out.println("Print your homeland");
            String country = scan.next();
            
            Person prs = new Person(name, birthDate, country);
            System.out.println(prs.toString());
        }
        
        if (objectCheck == 2) {
            System.out.println("Print your Name");
            String name = scan.next();
            System.out.println("Print your birthdate");
            String birthDate = scan.next();
            System.out.println("Print your homeland");
            String country = scan.next();
            
            System.out.println("Print your salary for an hour");
            int salary = scan.nextInt();
            System.out.println("Print your work schedule. 5/2 or 2/2 or anything else");
            String workSchedule = scan.next();
            System.out.println("Print how many hours you worked today");
            int workHours = scan.nextInt();
            System.out.println("Print the name of your job");
            String jobName = scan.next();
            
            Worker wrk = new Worker(salary, workSchedule, workHours, jobName, name, birthDate, country);
            System.out.println(wrk.toString());
        }
        
        if (objectCheck == 3) {
            System.out.println("Print your Name");
            String name = scan.next();
            System.out.println("Print your birthdate");
            String birthDate = scan.next();
            System.out.println("Print your homeland");
            String country = scan.next();
            
            System.out.println("Print your salary for an hour");
            int salary = scan.nextInt();
            System.out.println("Print your work schedule. 5/2 or 2/2 or anything else");
            String workSchedule = scan.next();
            System.out.println("Print how many hours you worked today");
            int workHours = scan.nextInt();
            System.out.println("Print the name of your job");
            String jobName = scan.next();
            
            System.out.println("Print your specialization Например - терапевт");
            String specialization = scan.next();
            System.out.println("Print your rise for the salary Прибавка к зарплате");
            String rise = scan.next();
            System.out.println("Print your overwork in hours");
            int overWork = scan.nextInt();
            
            Doctor dct = new Doctor(specialization,rise,overWork,salary,workSchedule,workHours,jobName, name, birthDate, country);
            System.out.println(dct.toString());
        }
    }
}
