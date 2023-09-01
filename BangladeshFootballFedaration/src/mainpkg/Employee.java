/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author USER
 */
import java.io.Serializable;

public class Employee implements Serializable {
    
    
    private String name,nid,uid,designation,salary,doj;

    public Employee(String name, String nid, String uid, String designation, String salary, String doj) {
        this.name = name;
        this.nid = nid;
        this.uid = uid;
        this.designation = designation;
        this.salary = salary;
        this.doj = doj;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", nid=" + nid + ", uid=" + uid + ", designation=" + designation + ", salary=" + salary + ", doj=" + doj + '}';
    }
    
    
}
    
