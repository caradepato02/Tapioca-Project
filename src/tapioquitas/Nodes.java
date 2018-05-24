/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapioquitas;

/**
 *
 * @author Rodrigo
 */
public class Nodes {
    private String sFirstName;
    private String sLastName;
    private int[] aiBirth =new int[3];
    private String sGender;
    private String sEmail;
    private String sPassword;
    private Nodes nNext;
    private Nodes nPrev;
    
    

    public Nodes(String sFirstName, String sLastName, String sGender, String sEmail, String sPassword, int[] aiBirth) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sGender = sGender;
        this.sEmail = sEmail;
        this.sPassword = sPassword;
        this.aiBirth = aiBirth;
        this.nNext = null;
        this.nPrev = null;
    }

    public Nodes() {
        this.sFirstName = "Rodrigo";
        this.sLastName = "Reyes";
        this.sGender = "Male";
        this.sEmail = "rod@gmail.com";
        this.sPassword = "Hola";
        this.aiBirth = new int[]{1,2,3};
        this.nNext = null;
        this.nPrev = null;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public int[] getAiBirth() {
        return aiBirth;
    }

    public void setAiBirth(int[] aiBirth) {
        this.aiBirth = aiBirth;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public Nodes getnNext() {
        return nNext;
    }

    public void setnNext(Nodes nNext) {
        this.nNext = nNext;
    }

    public Nodes getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodes nPrev) {
        this.nPrev = nPrev;
    }
    
}
