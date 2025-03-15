
package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB F
 * TGL: 15 Maret 2025
 */
import javax.swing.JOptionPane;
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mhs="Putri Pratiwi";
        long nim=2301010345L;
        String kls="A";
        
        BufferedReader dtIN = new BufferedReader (new InputStreamReader (System.in));
        
       try{
           System.out.print("Input Nama Mahasiswa: ");
           
          mhs = dtIN.readLine();
          System.out.print("Input NIM: ");
          nim = Long. parseLong ( dtIN.readLine());
          
       }catch (IOException e){
           System.out.println("Terjadi masalah saat ini");
       }
        kls = JOptionPane.showInputDialog("Input Kelas: ");
    
       System.out.println("Data "+mhs+" dengan NIM "+ nim);
    
    }
}
