package vit.adda.gitexp.pkg22mic0136;

public class Professor extends Person {
    private String empname;
    private String empid;
    private String dept;

    public Professor(String empname, String empid, String dept) {
        this.empname = empname;
        this.empid = empid;
        this.dept = dept;
    }

    @Override
    public String getDetails() {
        return "Professor Name: " + empname + ", EmpID: " + empid + ", Dept: " + dept;
    }

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