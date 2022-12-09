/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.io.Serializable;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class adminM implements Serializable{
    char [][]matriz;
    private static final long Serial = 563L;

    public adminM(char[][] matriz) {
        this.matriz = matriz;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "adminM{" + "matriz=" + matriz + '}';
    }
    
    
}
