/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.gitexp.pkg22mic0007;

/**
 *
 * @author vishn
 */

// Student.java
public class Student extends Person {
    private String name;
    private String regno;

    public Student(String name, String regno) {
        this.name = name;
        this.regno = regno;
    }

    @Override
    public String getDetails() {
        return "Student Name: " + name + ", Reg No: " + regno;
    }

    // Getters and setters for name and regno
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }
}
