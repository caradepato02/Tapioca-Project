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
public class Users {

    Nodes nStart;
    Nodes nEnd;
    int lenght;

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
        } else {
            nEnd.setnNext(nNode);
            nEnd = nNode;
        }
    }

    public void printList(){
        Nodes nTemp =nStart;
        while(nTemp!=null){
            System.out.println(nTemp.getsFirstName()+ " " +nTemp.getsLastName());
            nTemp=nTemp.getnNext();
        }
    }
    
    
    

    public static void hola() {

    }

}
