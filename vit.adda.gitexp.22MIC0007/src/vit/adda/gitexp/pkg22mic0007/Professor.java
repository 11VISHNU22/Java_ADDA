/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.gitexp.pkg22mic0007;

/**
 *
 * @author vishn
 */

// Professor.java
public class Professor extends Person {
    private String empid;
    private String dept;

    public Professor(String empid, String dept) {
        this.empid = empid;
        this.dept = dept;
    }

    @Override
    public String getDetails() {
        return "Professor EmpID: " + empid + ", Dept: " + dept;
    }

    // Getters and setters for empid and dept
    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}