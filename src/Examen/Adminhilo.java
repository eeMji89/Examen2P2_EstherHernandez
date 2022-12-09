package Examen;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Adminhilo extends Thread {
    private int [][]matriz;
    private boolean partida;
    private Random rd = new Random();
    
    public Adminhilo(int[][] matriz, boolean partida) {
        this.matriz = matriz;
        this.partida = partida;
    }

    public Adminhilo(int[][] matriz, boolean partida, Runnable target) {
        super(target);
        this.matriz = matriz;
        this.partida = partida;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public boolean isPartida() {
        return partida;
    }

    public void setPartida(boolean partida) {
        this.partida = partida;
    }
    
    
    
    public void run(){        
        int x = 1+rd.nextInt(matriz.length-1);
        int y = 1+rd.nextInt(matriz[0].length-1);
        int b1 = 1+rd.nextInt(matriz.length-1);
        int b2 = 1+rd.nextInt(matriz[0].length-1);
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i==x&&j==y) {
                    matriz[i][j]='O';
                }
                if (i==b1&&j==b2) {
                    matriz[i][j]='@';
                    if (i==0) {
                       // matriz[i][j
                                
                    }
                }
            }
        }
    }
          
}
