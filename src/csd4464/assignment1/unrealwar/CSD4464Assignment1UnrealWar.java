/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.unrealwar;

/**
 *
 * @author c0687799
 */
public class CSD4464Assignment1UnrealWar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String stringPower(String str, int i) {
        if (i < 1) {
            return null;
        }

        String s = "";

        for (int x = 0; x < i; x++) {
            s = s + str;
        }

        return s;

    }

}
