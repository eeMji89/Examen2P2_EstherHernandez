package Examen;


import java.util.Random;



/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Adminhilo extends Thread {
    private char [][]matriz;
    private boolean partida;
    private Random rd = new Random();

    public Adminhilo() {
    }
    
    
    
    public Adminhilo(char[][] matriz, boolean partida) {
        this.matriz = matriz;
        this.partida = partida;
    }

    public Adminhilo(char[][] matriz, boolean partida, Runnable target) {
        super(target);
        this.matriz = matriz;
        this.partida = partida;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
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
                
                
            }
        }
    }
          
}
