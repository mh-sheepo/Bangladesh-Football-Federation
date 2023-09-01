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
public class EntryHistoryOfPlayer implements Serializable {
    
    private int Age  ;
    private String Player_Name , History_Of_Player ;
    LocalDate DOI , DOC ;

    public EntryHistoryOfPlayer(int Age, String Player_Name, String History_Of_Player, LocalDate DOI, LocalDate DOC) {
        this.Age = Age;
        this.Player_Name = Player_Name;
        this.History_Of_Player = History_Of_Player;
        this.DOI = DOI;
        this.DOC = DOC;
    }
    
    


    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPlayer_Name() {
        return Player_Name;
    }

    public void setPlayer_Name(String Player_Name) {
        this.Player_Name = Player_Name;
    }

    public String getHistory_Of_Player() {
        return History_Of_Player;
    }

    public void setHistory_Of_Player(String History_Of_Player) {
        this.History_Of_Player = History_Of_Player;
    }

    public LocalDate getDOI() {
        return DOI;
    }

    public void setDOI(LocalDate DOI) {
        this.DOI = DOI;
    }

    public LocalDate getDOC() {
        return DOC;
    }

    public void setDOC(LocalDate DOC) {
        this.DOC = DOC;
    }

    @Override
    public String toString() {
        return "EntryHistoryOfPlayer{" + "Age=" + Age + ", Player_Name=" + Player_Name + ", History_Of_Player=" + History_Of_Player + ", DOI=" + DOI + ", DOC=" + DOC + '}';
    }
    
    
}