package IO_Programming.CSV.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Validation {
    public static void main(String[] args) {
        try (BufferedReader br= new BufferedReader(new FileReader("D:\\Apexon\\BL_Java_Training\\IO_Programming\\Buffer\\BufferData.csv"))) {
            String line;
            while((line= br.readLine())!=null){
                String[] data= line.split(",");
                if(data.length!=4){
                    System.out.println("Invalid column format : " +line);
                    continue;
                }
                if(data[1].isEmpty() || !data[1].matches("^[a-zA-Z]{2,}$")){
                    System.out.println("Invalid Name" +  line);
                    continue;
                }
                if(!data[3].matches("^[1-9][0-9]*$")){
                    System.out.println("Invalid Salary" +  line);
                    continue;
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
