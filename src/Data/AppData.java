/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author adam
 */
public class AppData {
    // uname = user name
    // ms = maths score
    // gs = geography score
    // is = ICT score
    // os = odd one out score
    
    public String username;
    public int ms;
    public int gs;
    public int iss;
    public int os;
    
    public AppData(String username, int os, int ms, int gs, int iss){
            this.username = username;
            this.os = os;
            this.ms = ms;
            this.gs = gs;
            this.iss = iss;   
    }
    public String getusername() {
        return username;
    }
    public void setusername(String username) { 
        this.username = username;
    }
    public int getos() {
        return os;
    }
    public void setos(int os) { 
        this.os = os;
    }
    public int getms() {
        return ms;
    }
    public void setms(int ms) { 
        this.ms = ms;
    }
    public int getgs() {
        return gs;
    }
    public void setgs(int gs) { 
        this.gs = gs;
    }
    public int getis() {
        return iss;
    }
    public void setis(int iss) { 
        this.iss = iss;
    }

    
    
}