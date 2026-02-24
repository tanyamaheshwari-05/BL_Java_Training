package IO_Programming.CSV.Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVBuffer {
    public static void main(String[] args) {
         try(BufferedWriter bw= new BufferedWriter(new FileWriter("BufferData.csv"))){
            bw.write("1,Tanya,Intern,200000\n");
            bw.write("2,Manya,Head,400000\n");
            bw.write("4,Sanya,Manager,7700000\n");

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
