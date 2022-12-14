package Examen;


import java.util.Random;
import javax.swing.JTextArea;



/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Adminhilo extends Thread {
    private char [][]matriz;
    private boolean partida;
    private char instruccion;
    private Random rd = new Random();
    private JTextArea jt = new JTextArea();

    public Adminhilo() {
    }

    public char getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(char instruccion) {
        this.instruccion = instruccion;
    }

    public Random getRd() {
        return rd;
    }

    public JTextArea getJt() {
        return jt;
    }

    public void setJt(JTextArea jt) {
        this.jt = jt;
    }
    
    public void setRd(Random rd) {
        this.rd = rd;
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
     public String imprimir(char [][]m){
        String mapa = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {               
                if (m[i][j]=='*') {
                    mapa+= m[i][j]+" ";
                }
                else{
                    mapa+=""+ m[i][j]+" ";
                }           
            }
            mapa+="\n";
        }
        return mapa;
    }
    
    public void run(){        
        int x = 1 + rd.nextInt(matriz.length - 1);
        int y = 1 + rd.nextInt(matriz[0].length - 1);
        int x1 = 0;
        int y1=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == x && j == y) {
                    matriz[i][j] = 'O';
                }
                if (matriz[i][j] == '@') {
                    x1=i;
                    y1=j;
                }
            }
        }
        while(partida == true){   
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    
                }
            }
                if (instruccion =='d') {
                        matriz[x1][y1] = 'X';
                       matriz[x1+1][y1] = '@';                    
                }
                if (instruccion=='u') {
                    matriz[x1][y1] = 'X';
                    matriz[x1-1][y1] = '@';
                               
                }
                if (instruccion=='w') {
                    matriz[x1][y1] = 'X';
                    matriz[x1][y1-1] = '@';
                   
                }
                if (instruccion=='e') {
                    matriz[x1][y1] = 'X';
                    matriz[x1][y1+1] = '@';
                    
                }
                //System.out.println(imprimir(matriz));
                //jt.setText(imprimir(matriz));
                
                try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                
            
        }
    }
          
}
