/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;
import java.io.Serializable;

public class GeneralNotice implements Serializable {
    
      private String notice;

    public GeneralNotice(String notice) {
        this.notice = notice;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "GeneralNotice{\n" + 
                "notice=" + notice +  "\n"+"}\n";
    }

}
