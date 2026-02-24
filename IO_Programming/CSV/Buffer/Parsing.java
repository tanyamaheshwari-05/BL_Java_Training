package IO_Programming.CSV.Buffer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Parsing {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader("D:\\Apexon\\BL_Java_Training\\IO_Programming\\Buffer\\BufferData.csv"))) {
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id= Integer.parseInt(data[0]); //convert string into int.
                String name=data[1];
                String depat=data[2];
                int salary= Integer.parseInt(data[3]); // convert string into int.

                System.out.println("Id :" +id);
                System.out.println("Name :" +name);
                System.out.println("Department :" +depat);
                System.out.println("salary :" +salary);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
