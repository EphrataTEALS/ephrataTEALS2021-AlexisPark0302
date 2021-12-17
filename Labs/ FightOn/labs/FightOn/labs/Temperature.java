package labs;

public class Temperature {
    

    public static void main (String[] args) {
        
        // Input a temperature in Fahrenheit

        double fahrenheit = 95;
        double celcius = 0;

        //Calculate temperature in Celcuis

        double convertToCelcius = (fahrenheit - 32) * 5.0/9.0;
        double convertToFahrenheit = (celcius * 9.0/5.0) + 32;

        //Output
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + convertToCelcius + "degrees Celcius");
        System.out.println(celcius + "degrees Celcius is equal to " + convertToFahrenheit + " degrees Fahrenheit");
    }
}