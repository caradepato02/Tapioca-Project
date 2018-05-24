/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapioquitas;


import Frames.Home;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tapioquitas {

    /**
     * @param args the command line arguments
     */
    static Users UsersList = new Users();

    public static void main(String[] args) {
        ReadFile();
        UsersList.printList();
    }

    public static void CreateUser(String sFirstName, String sLastName, String sGender, String sEmail, String sPassword, int[] aiBirth) {
        JOptionPane.showMessageDialog(null, sFirstName + " " + sLastName + " " + sGender + " " + sEmail + " " + sPassword + " " + aiBirth[0] + "," + aiBirth[1] + "," + aiBirth[2]);

        FileWriter fwWrite = null;
        BufferedWriter bwWrite = null;
        try {
            fwWrite = new FileWriter("User.txt", true);
            bwWrite = new BufferedWriter(fwWrite);
            bwWrite.write(sFirstName + "," + sLastName + "," + sGender + "," + sEmail + "," + sPassword + "," + aiBirth[0] + "," + aiBirth[1] + "," + aiBirth[2]);
            bwWrite.newLine();
            bwWrite.close();

        } catch (Exception e) {

        } finally {
            if (fwWrite != null) {
                try {//cierra el flujo principal
                    fwWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void ReadFile() {
        File file = new File("User.txt");
        Scanner scScan;
        int iAge[];
        try {
           
            scScan = new Scanner(file);
            while (scScan.hasNextLine()) {
                String sUser = scScan.nextLine();
                Scanner scDelimitar = new Scanner(sUser);
                scDelimitar.useDelimiter("\\s*,\\s*");
                UsersList.add(new Nodes());
                UsersList.nEnd.setsFirstName(scDelimitar.next());
                UsersList.nEnd.setsLastName(scDelimitar.next());
                UsersList.nEnd.setsGender(scDelimitar.next());
                UsersList.nEnd.setsEmail(scDelimitar.next());
                UsersList.nEnd.setsPassword(scDelimitar.next());
                iAge = new int[3];
                iAge[0] = Integer.parseInt((String)scDelimitar.next());
                iAge[1] = Integer.parseInt((String)scDelimitar.next());
                iAge[2] = Integer.parseInt((String)scDelimitar.next());
                UsersList.nEnd.setAiBirth(iAge);
            }
        } catch (Exception e) {
            System.out.println("Caca");
        }

    }
}
