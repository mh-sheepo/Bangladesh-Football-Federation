/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fatema;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Momo
 */
public class FixedMatchtime  implements Serializable{
    
    private String  Place;
    private int  Time;
    LocalDate Datepicker ;

    public FixedMatchtime(String Place, int Time, LocalDate Datepicker) {
        this.Place = Place;
        this.Time = Time;
        this.Datepicker = Datepicker;
    }

    public String getPlace() {
        return Place;
    }

    public int getTime() {
        return Time;
    }

    public LocalDate getDatepicker() {
        return Datepicker;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public void setDatepicker(LocalDate Datepicker) {
        this.Datepicker = Datepicker;
    }

    @Override
    public String toString() {
        return "FixedMatchtime{" + "Place=" + Place + ", Time=" + Time + ", Datepicker=" + Datepicker + '}';
    }

  
}
