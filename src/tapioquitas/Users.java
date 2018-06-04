/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapioquitas;

import Frames.Login;

/**
 *
 * @author Rodrigo
 */
public class Users {

    private Nodes nStart;//Guarda el nodo inicial
    private Nodes nEnd;//Guarda el nodo final
    public Nodes nActiveUser;//Guarda el nodo del usuario activo
    public Nodes nUserCourse;//Guarda el curso del usuario activo
    private Nodes nLastUsed;//Guarda el ultimo nodo usado

    //Marcan el inicio y final de la categoria en la lista
    private Nodes nMusicStart;
    private Nodes nMusicEnd;
    private Nodes nVisualStart;
    private Nodes nVisualEnd;
    private Nodes nDanceStart;
    private Nodes nDanceEnd;
    private Nodes nSchoolStart;
    private Nodes nSchoolEnd;

    private int lenght = 0;//Guarda tamaño de la lista
    private int iMusicLenght = 0;
    private int iDanceLenght = 0;
    private int iSchoolLenght = 0;
    private int iVisualLenght = 0;

    public Users() {
        nStart = null;
        nEnd = null;
    }

    public Users(Nodes nStart) {
        this.nStart = nStart;
        this.nEnd = nStart;
    }

    public void add(Nodes nNode) {
        if (nStart == null) {
            nStart = nNode;
            nEnd = nNode;
            switch (nNode.getsCategory()) {
                case "music":
                    nMusicStart = nNode;
                    nMusicEnd = nNode;
                    iMusicLenght++;
                    break;
                case "dance":
                    nDanceStart = nNode;
                    nDanceEnd = nNode;
                    iDanceLenght++;
                    break;
                case "school":
                    nSchoolStart = nNode;
                    nSchoolEnd = nNode;
                    iSchoolLenght++;
                    break;
                case "visual art":
                    nVisualStart = nNode;
                    nVisualEnd = nNode;
                    iVisualLenght++;
                    break;
                default:

            }
        } else {
            switch (nNode.getsCategory()) {
                case "music":
                    if (nMusicStart == null && nMusicEnd == null) {
                        nEnd.setnNext(nNode);
                        nNode.setnPrev(nEnd);
                        nEnd = nNode;
                        nMusicStart = nNode;
                        nMusicEnd = nNode;

                    } else if (nMusicEnd.getnNext() == null) {
                        nMusicEnd.setnNext(nNode);
                        nNode.setnPrev(nMusicEnd);
                        nMusicEnd = nNode;
                        nEnd = nNode;
                    } else {
                        nNode.setnNext(nMusicEnd.getnNext());
                        nNode.setnPrev(nMusicEnd);
                        nMusicEnd.setnNext(nNode);
                        nMusicEnd.getnNext().setnPrev(nNode);
                        nMusicEnd = nNode;
                    }
                    iMusicLenght++;
                    break;

                case "dance":

                    if (nDanceStart == null && nDanceEnd == null) {
                        nEnd.setnNext(nNode);
                        nNode.setnPrev(nEnd);
                        nEnd = nNode;
                        nDanceStart = nNode;
                        nDanceEnd = nNode;

                    } else if (nDanceEnd.getnNext() == null) {
                        nDanceEnd.setnNext(nNode);
                        nNode.setnPrev(nDanceEnd);
                        nDanceEnd = nNode;
                        nEnd = nNode;
                    } else {
                        nNode.setnNext(nDanceEnd.getnNext());
                        nNode.setnPrev(nDanceEnd);
                        nDanceEnd.setnNext(nNode);
                        nDanceEnd.getnNext().setnPrev(nNode);
                        nDanceEnd = nNode;
                    }
                    iDanceLenght++;
                    break;
                case "school":

                    if (nSchoolStart == null && nSchoolEnd == null) {
                        nEnd.setnNext(nNode);
                        nNode.setnPrev(nEnd);
                        nEnd = nNode;
                        nSchoolStart = nNode;
                        nSchoolEnd = nNode;

                    } else if (nSchoolEnd.getnNext() == null) {
                        nSchoolEnd.setnNext(nNode);
                        nNode.setnPrev(nSchoolEnd);
                        nSchoolEnd = nNode;
                        nEnd = nNode;
                    } else {
                        nNode.setnNext(nSchoolEnd.getnNext());
                        nNode.setnPrev(nSchoolEnd);
                        nSchoolEnd.setnNext(nNode);
                        nSchoolEnd.getnNext().setnPrev(nNode);
                        nSchoolEnd = nNode;
                    }
                    iSchoolLenght++;
                    break;
                case "visual art":

                    if (nVisualStart == null && nVisualEnd == null) {
                        nEnd.setnNext(nNode);
                        nNode.setnPrev(nEnd);
                        nEnd = nNode;
                        nVisualStart = nNode;
                        nVisualEnd = nNode;

                    } else if (nVisualEnd.getnNext() == null) {
                        nVisualEnd.setnNext(nNode);
                        nNode.setnPrev(nVisualEnd);
                        nVisualEnd = nNode;
                        nEnd = nNode;
                    } else {
                        nNode.setnNext(nVisualEnd.getnNext());
                        nNode.setnPrev(nVisualEnd);
                        nVisualEnd.setnNext(nNode);
                        nVisualEnd.getnNext().setnPrev(nNode);
                        nVisualEnd = nNode;
                    }
                    iVisualLenght++;
                    break;
                default:
                    nEnd.setnNext(nNode);
                    nEnd = nNode;
                    break;
            }

        }
        Login.iCountIndex++;
        lenght++;
    }

    public void removeCourse() {
        Nodes ntemp = nUserCourse;
        switch (nUserCourse.getsCategory()) {
            case "music":
                if (nUserCourse.getnNext() == null) {
                    nEnd = nUserCourse.getnPrev();
                    nMusicEnd = nUserCourse.getnPrev();
                    nUserCourse.getnPrev().setnNext(null);
                } else if (nUserCourse.getnPrev() == null) {
                    nStart = nUserCourse.getnNext();
                    nMusicStart = nUserCourse.getnNext();
                    nUserCourse.getnNext().setnPrev(null);
                } else {
                    if (!nUserCourse.getnNext().getsCategory().equals("music")) {
                        nMusicEnd = nUserCourse.getnPrev();
                    }
                    if (!nUserCourse.getnPrev().getsCategory().equals("music")) {
                        nMusicStart = nUserCourse.getnNext();
                    }
                    ntemp = nUserCourse.getnNext();
                    ntemp.setnPrev(nUserCourse.getnPrev());
                    ntemp = nUserCourse.getnPrev();
                    ntemp.setnNext(nUserCourse.getnNext());
                }
                iMusicLenght--;
                break;

            case "dance":

                if (nUserCourse.getnNext() == null) {
                    nEnd = nUserCourse.getnPrev();
                    nDanceEnd = nUserCourse.getnPrev();
                    nUserCourse.getnPrev().setnNext(null);
                } else if (nUserCourse.getnPrev() == null) {
                    nStart = nUserCourse.getnNext();
                    nDanceStart = nUserCourse.getnNext();
                    nUserCourse.getnNext().setnPrev(null);
                } else {
                    if (!nUserCourse.getnNext().getsCategory().equals("dance")) {
                        nDanceEnd = nUserCourse.getnPrev();
                    }
                    if (!nUserCourse.getnPrev().getsCategory().equals("dance")) {
                        nDanceStart = nUserCourse.getnNext();
                    }
                    ntemp = nUserCourse.getnNext();
                    ntemp.setnPrev(nUserCourse.getnPrev());
                    ntemp = nUserCourse.getnPrev();
                    ntemp.setnNext(nUserCourse.getnNext());
                }
                iDanceLenght--;
                break;
            case "school":

                if (nUserCourse.getnNext() == null) {
                    nEnd = nUserCourse.getnPrev();
                    nSchoolEnd = nUserCourse.getnPrev();
                    nUserCourse.getnPrev().setnNext(null);
                } else if (nUserCourse.getnPrev() == null) {
                    nStart = nUserCourse.getnNext();
                    nSchoolStart = nUserCourse.getnNext();
                    nUserCourse.getnNext().setnPrev(null);
                } else {
                    if (!nUserCourse.getnNext().getsCategory().equals("school")) {
                        nSchoolEnd = nUserCourse.getnPrev();
                    }
                    if (!nUserCourse.getnPrev().getsCategory().equals("school")) {
                        nSchoolStart = nUserCourse.getnNext();
                    }
                    ntemp = nUserCourse.getnNext();
                    ntemp.setnPrev(nUserCourse.getnPrev());
                    ntemp = nUserCourse.getnPrev();
                    ntemp.setnNext(nUserCourse.getnNext());
                }
                iSchoolLenght--;
                break;
            case "visual art":

                if (nUserCourse.getnNext() == null) {
                    nEnd = nUserCourse.getnPrev();
                    nVisualEnd = nUserCourse.getnPrev();
                    nUserCourse.getnPrev().setnNext(null);
                } else if (nUserCourse.getnPrev() == null) {
                    nStart = nUserCourse.getnNext();
                    nVisualStart = nUserCourse.getnNext();
                    nUserCourse.getnNext().setnPrev(null);
                } else {
                    if (!nUserCourse.getnNext().getsCategory().equals("visual art")) {
                        nVisualEnd = nUserCourse.getnPrev();
                    }
                    if (!nUserCourse.getnPrev().getsCategory().equals("visual art")) {
                        nVisualStart = nUserCourse.getnNext();
                    }
                    ntemp = nUserCourse.getnNext();
                    ntemp.setnPrev(nUserCourse.getnPrev());
                    ntemp = nUserCourse.getnPrev();
                    ntemp.setnNext(nUserCourse.getnNext());
                }
                iVisualLenght--;
                break;
        }
        lenght--;
    }

    public void printList() {
        Nodes nTemp = nStart;
        while (nTemp != null) {
            System.out.println(nTemp.getsFirstName() + " " + nTemp.getsLastName() + " " + nTemp.getsCategory());
            nTemp = nTemp.getnNext();
        }
    }

    public String[] getAllCourse(int i) {
        Nodes nTemp = nStart;
        if (i != 0) {
            nTemp = nLastUsed.getnNext();
        }
        String[] asCourse = new String[7];
        asCourse[0] = nTemp.getsCourseName();
        asCourse[1] = nTemp.getsCategory();
        asCourse[2] = nTemp.getsFirstName();
        asCourse[3] = nTemp.getsLastName();
        asCourse[4] = nTemp.getsNumber();
        asCourse[5] = String.valueOf(nTemp.getiIdexCourse());
        asCourse[6] = nTemp.getsDescription();
        nLastUsed = nTemp;
        return asCourse;
    }

    public String[] getCourses(int i, int iCat) {
        Nodes nTemp = nStart;
        switch (iCat) {
            case 0:
                if (i == 0) {
                    nTemp = nStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 1:
                if (i == 0) {
                    nTemp = nMusicStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 2:
                if (i == 0) {
                    nTemp = nDanceStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 3:
                if (i == 0) {
                    nTemp = nSchoolStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 4:
                if (i == 0) {
                    nTemp = nVisualStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

        }
        String[] asCourse = new String[6];

        asCourse[0] = nTemp.getsCourseName();
        asCourse[1] = nTemp.getsCategory();
        asCourse[2] = nTemp.getsFirstName() + " " + nTemp.getsLastName();
        asCourse[3] = nTemp.getsNumber();
        asCourse[4] = nTemp.getsDescription();
        asCourse[5] = String.valueOf(nTemp.getiIdexCourse());

        nLastUsed = nTemp;
        return asCourse;
    }

    public String[] SearchCourse(int i, int iCat, String sFind) {
        Nodes nTemp = nStart;
        switch (iCat) {
            case 0:
                if (i == 0) {
                    nTemp = nStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 1:
                if (i == 0) {
                    nTemp = nMusicStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 2:
                if (i == 0) {
                    nTemp = nDanceStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 3:
                if (i == 0) {
                    nTemp = nSchoolStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

            case 4:
                if (i == 0) {
                    nTemp = nVisualStart;
                } else {
                    nTemp = nLastUsed.getnNext();
                }
                break;

        }
        String[] asCourse = new String[5];

        if (sFind.equalsIgnoreCase(nTemp.getsFirstName())
                || sFind.equalsIgnoreCase(nTemp.getsLastName())
                || nTemp.getsDescription().toLowerCase().contains(sFind.toLowerCase())
                || nTemp.getsCourseName().toLowerCase().contains(sFind.toLowerCase())) {
            asCourse[0] = nTemp.getsCourseName();
            asCourse[1] = nTemp.getsCategory();
            asCourse[2] = nTemp.getsFirstName() + " " + nTemp.getsLastName();
            asCourse[3] = nTemp.getsNumber();
            asCourse[4] = nTemp.getsDescription();
        }

        nLastUsed = nTemp;
        return asCourse;
    }

    public void LoginSearchCourse(int iIndex) {
        Nodes nTemp = nStart;
        while (nTemp != null) {
            if (iIndex == nTemp.getiIdexCourse()) {
                nUserCourse = nTemp;
                break;
            }
            nTemp = nTemp.getnNext();
        }
    }

    public boolean LoginSearchUser(String sEmail, String sPass) {
        Nodes nTemp = nStart;
        while (nTemp != null) {
            if (nTemp.getsEmail().equals(sEmail) && nTemp.getsPassword().equals(sPass)) {
                nActiveUser = nTemp;
                return true;
            }
            nTemp = nTemp.getnNext();
        }
        return false;
    }

    public String[] getAllUsers(int i) {
        Nodes nTemp = nStart;
        if (i != 0) {
            nTemp = nLastUsed.getnNext();
        }
        String[] asData = new String[9];
        asData[0] = nTemp.getsFirstName();
        asData[1] = nTemp.getsLastName();
        asData[2] = nTemp.getsGender();
        asData[3] = nTemp.getsEmail();
        asData[4] = nTemp.getsPassword();
        int[] aiBirth = nTemp.getAiBirth();
        asData[5] = String.valueOf(aiBirth[0]);
        asData[6] = String.valueOf(aiBirth[1]);
        asData[7] = String.valueOf(aiBirth[2]);
        asData[8] = String.valueOf(nTemp.getiIdexCourse());
        nLastUsed = nTemp;
        return asData;

    }

    public int getLenght() {
        return lenght;
    }

    public int getiMusicLenght() {
        return iMusicLenght;
    }

    public void setiMusicLenght(int iMusicLenght) {
        this.iMusicLenght = iMusicLenght;
    }

    public int getiDanceLenght() {
        return iDanceLenght;
    }

    public void setiDanceLenght(int iDanceLenght) {
        this.iDanceLenght = iDanceLenght;
    }

    public int getiSchoolLenght() {
        return iSchoolLenght;
    }

    public void setiSchoolLenght(int iSchoolLenght) {
        this.iSchoolLenght = iSchoolLenght;
    }

    public int getiVisualLenght() {
        return iVisualLenght;
    }

    public void setiVisualLenght(int iVisualLenght) {
        this.iVisualLenght = iVisualLenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

}
