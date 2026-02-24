package IO_Programming.CSV.File;


import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        try(FileWriter fr= new FileWriter("Filed.csv")){
            fr.write("1,Tanya,Hr,200000\n");
            fr.write("2,Sanya,Manager,400000\n");
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
       
    }
    
}
