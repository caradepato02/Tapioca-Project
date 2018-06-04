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
    private int[] aiBirth = new int[3];
    private String sGender;
    private String sEmail;
    private String sPassword;
    private int iIdexCourse;
    private String sCategory;

    private String sCourseName;
    private String sNumber;
    private String sDescription;

    private Nodes nNext;
    private Nodes nPrev;

    public Nodes(String sFirstName, String sLastName, String sGender, String sEmail, String sPassword, int[] aiBirth, int iIndex) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sGender = sGender;
        this.sEmail = sEmail;
        this.sPassword = sPassword;
        this.aiBirth = aiBirth;
        this.iIdexCourse = iIndex;
        this.sCategory = "null";
        this.nNext = null;
        this.nPrev = null;
    }

    public Nodes() {
        this.nNext = null;
        this.nPrev = null;
        this.sCategory = "null";
    }

    public Nodes(String sFirstName, String sLastName, int iIdexCourse, String sCategory, String sCourseName, String sNumber, String sDescription) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.iIdexCourse = iIdexCourse;
        this.sCategory = sCategory;
        this.sCourseName = sCourseName;
        this.sNumber = sNumber;
        this.sDescription = sDescription;
        this.nNext = null;
        this.nPrev = null;
    }

    public String getsCourseName() {
        return sCourseName;
    }

    public void setsCourseName(String sCourseName) {
        this.sCourseName = sCourseName;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public int getiIdexCourse() {
        return iIdexCourse;
    }

    public void setiIdexCourse(int iIdexCourse) {
        this.iIdexCourse = iIdexCourse;
    }

    public String getsCategory() {
        return sCategory;
    }

    public void setsCategory(String sCategory) {
        this.sCategory = sCategory;
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
