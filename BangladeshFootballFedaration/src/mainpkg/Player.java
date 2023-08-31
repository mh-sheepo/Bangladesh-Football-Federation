/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

public class Player implements Serializable {
    
      private String Player1,Player2,Player3,Player4,Player5,Player6,Player7,Player8,Player9,Player10,Player11;

    public String getPlayer1() {
        return Player1;
    }

    public void setPlayer1(String Player1) {
        this.Player1 = Player1;
    }

    public String getPlayer2() {
        return Player2;
    }

    public void setPlayer2(String Player2) {
        this.Player2 = Player2;
    }

    public String getPlayer3() {
        return Player3;
    }

    public void setPlayer3(String Player3) {
        this.Player3 = Player3;
    }

    public String getPlayer4() {
        return Player4;
    }

    public void setPlayer4(String Player4) {
        this.Player4 = Player4;
    }

    public String getPlayer5() {
        return Player5;
    }

    public void setPlayer5(String Player5) {
        this.Player5 = Player5;
    }

    public String getPlayer6() {
        return Player6;
    }

    public void setPlayer6(String Player6) {
        this.Player6 = Player6;
    }

    public String getPlayer7() {
        return Player7;
    }

    public void setPlayer7(String Player7) {
        this.Player7 = Player7;
    }

    public String getPlayer8() {
        return Player8;
    }

    public void setPlayer8(String Player8) {
        this.Player8 = Player8;
    }

    public String getPlayer9() {
        return Player9;
    }

    public void setPlayer9(String Player9) {
        this.Player9 = Player9;
    }

    public String getPlayer10() {
        return Player10;
    }

    public void setPlayer10(String Player10) {
        this.Player10 = Player10;
    }

    public String getPlayer11() {
        return Player11;
    }

    public void setPlayer11(String Player11) {
        this.Player11 = Player11;
    }

    public Player(String Player1, String Player2, String Player3, String Player4, String Player5, String Player6, String Player7, String Player8, String Player9, String Player10, String Player11) {
        this.Player1 = Player1;
        this.Player2 = Player2;
        this.Player3 = Player3;
        this.Player4 = Player4;
        this.Player5 = Player5;
        this.Player6 = Player6;
        this.Player7 = Player7;
        this.Player8 = Player8;
        this.Player9 = Player9;
        this.Player10 = Player10;
        this.Player11 = Player11;
    }

    @Override
    public String toString() {
    return "Player{" +
            "\nPlayer1=" + Player1 +
            "\nPlayer2=" + Player2 +
            "\nPlayer3=" + Player3 +
            "\nPlayer4=" + Player4 +
            "\nPlayer5=" + Player5 +
            "\nPlayer6=" + Player6 +
            "\nPlayer7=" + Player7 +
            "\nPlayer8=" + Player8 +
            "\nPlayer9=" + Player9 +
            "\nPlayer10=" + Player10 +
            "\nPlayer11=" + Player11 +
            '}';
}

}
