/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapioquitas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Users {
    Nodes nStart;
    Nodes nEnd;
    int lenght;
    
   
    public static void CreateUser(String sFirstName, String sLastName, String sGender, String sEmail, String sPassword, int[] aiBirth){
        JOptionPane.showMessageDialog(null,sFirstName +" "+ sLastName +" "+ sGender +" "+ sEmail + " "+ sPassword);
    }
    
    public void hola(){
        
    }
    
}
