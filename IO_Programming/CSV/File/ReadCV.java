package IO_Programming.CSV.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadCV {
    public static void main(String[] args) {
        try(FileReader fr= new FileReader("D:\\Apexon\\BL_Java_Training\\IO_Programming\\File\\Filed.csv")){
            int data;
            while((data=fr.read())!=-1){
                System.out.print((char)data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
