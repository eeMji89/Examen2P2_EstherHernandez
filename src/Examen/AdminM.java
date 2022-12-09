
package Examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class AdminM {
    ArrayList <Matriz> matrices= new ArrayList();
    File archivo = null;
    public AdminM(String path){
        archivo = new File(path);
    }
    public AdminM(ArrayList<Matriz> matrices) {
        this.matrices = matrices;
    }

    public ArrayList<Matriz> getMatrices() {
        return matrices;
    }

    public void setMatrices(ArrayList<Matriz> matrices) {
        this.matrices = matrices;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     
    public void guardar(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Matriz mat : matrices) {
               bw.writeObject(mat); 
            }
            
            
            bw.flush();
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    public void cargar(){
        try {
            Matriz m ;
            char [][]temp; 
           if (archivo.exists()) {               
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                   while ((m = (Matriz) objeto.readObject()) != null) {
                        matrices.add(m);
                    }
               } catch (Exception e) {
               }
                objeto.close();
                entrada.close();
           }
                
        } catch (Exception e) {
                
                }
         finally {
        }
    }
}
