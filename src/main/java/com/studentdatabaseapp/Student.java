package com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private final static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("1- Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student Class Level: ");
        this.gradeYear = in.nextLine();

        setStudentID();

    }

    private String setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
        return studentID;
    }

    public void enroll() {

        do {
            System.out.print("Enter Course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }    while (1 != 0);

    }

    public void viewBalance() {
        System.out.println("Your balance is: " + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $: " + tuitionBalance);
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
        viewBalance();
    }

    public String toString() {
            return  "Name:" + firstName + " " + lastName +
                    "\nGrade Year: " + gradeYear +
                    "\nStudent ID: " + studentID +
                    "\nCourses Enrolled:" + courses +
                    "\nBalance:" + tuitionBalance;

    }

}








