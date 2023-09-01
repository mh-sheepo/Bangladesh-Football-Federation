/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Finance implements Serializable {
    
    private String name,designation;
private int revenue,monthlyprofit,dues,lastpayment,taxes,uid,empsalary,paymentrecords;

    public Finance(String name, String designation, int revenue, int monthlyprofit, int dues, int lastpayment, int taxes, int uid, int empsalary, int paymentrecords) {
        this.name = name;
        this.designation = designation;
        this.revenue = revenue;
        this.monthlyprofit = monthlyprofit;
        this.dues = dues;
        this.lastpayment = lastpayment;
        this.taxes = taxes;
        this.uid = uid;
        this.empsalary = empsalary;
        this.paymentrecords = paymentrecords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getMonthlyprofit() {
        return monthlyprofit;
    }

    public void setMonthlyprofit(int monthlyprofit) {
        this.monthlyprofit = monthlyprofit;
    }

    public int getDues() {
        return dues;
    }

    public void setDues(int dues) {
        this.dues = dues;
    }

    public int getLastpayment() {
        return lastpayment;
    }

    public void setLastpayment(int lastpayment) {
        this.lastpayment = lastpayment;
    }

    public int getTaxes() {
        return taxes;
    }

    public void setTaxes(int taxes) {
        this.taxes = taxes;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public int getPaymentrecords() {
        return paymentrecords;
    }

    public void setPaymentrecords(int paymentrecords) {
        this.paymentrecords = paymentrecords;
    }

    @Override
    public String toString() {
        return "Finance{" + "name=" + name + ", designation=" + designation + ", revenue=" + revenue + ", monthlyprofit=" + monthlyprofit + ", dues=" + dues + ", lastpayment=" + lastpayment + ", taxes=" + taxes + ", uid=" + uid + ", empsalary=" + empsalary + ", paymentrecords=" + paymentrecords + '}';
    }

}