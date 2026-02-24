package IO_Programming.CSV.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVBuffer {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader("D:\\Apexon\\BL_Java_Training\\IO_Programming\\Buffer\\BufferData.csv"))) {
           String line;
           while((line=br.readLine())!=null){
            String[] data=line.split(",");
            System.out.println("Id : "+ data[0] + " Name : "+data[1]+ " Department : " + data[2] + " Salary : "+ data[3]);
           }
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
