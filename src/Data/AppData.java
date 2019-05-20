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
    
    private String uname;
    private int ms;
    private int gs;
    private int is;
    private int os;
    
    public AppData(String uname, int os, int ms, int gs, int is){
            this.uname = uname;
            this.os = os;
            this.ms = ms;
            this.gs = gs;
            this.is = is;   
    }
}