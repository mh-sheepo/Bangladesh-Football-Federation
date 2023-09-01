/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Meeting implements Serializable {
    
    protected String meetingtopic,note;
    protected LocalDate dateOfmeeting;

    public Meeting(String meetingtopic, String note, LocalDate dateOfmeeting) {
        this.meetingtopic = meetingtopic;
        this.note = note;
        this.dateOfmeeting = dateOfmeeting;
    }

    public String getMeetingtopic() {
        return meetingtopic;
    }

    public void setMeetingtopic(String meetingtopic) {
        this.meetingtopic = meetingtopic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDateOfmeeting() {
        return dateOfmeeting;
    }

    public void setDateOfmeeting(LocalDate dateOfmeeting) {
        this.dateOfmeeting = dateOfmeeting;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingtopic=" + meetingtopic + ", note=" + note + ", dateOfmeeting=" + dateOfmeeting + '}';
    }
}

  