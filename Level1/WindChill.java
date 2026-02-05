import java.util.*;
public class WindChill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        WindChill windchill = new WindChill();
        System.out.print("Enter the temperature: ");
        double temperature=sc.nextDouble();
        System.out.print("Enter the Wind Speed: ");
        double windSpeed=sc.nextDouble();
        System.out.print("The wind chill "+windchill.calculateWindChill(temperature,windSpeed)+ "on temperature " + temperature + " and wind Speed " +windSpeed);

    }
    public double calculateWindChill(double temperature, double windSpeed){
        double windChill= 35.74+ 0.6125 * temperature +(0.4275 *temperature-35.75)*Math.pow(windSpeed,0.16);
        return windChill;
    }
}
