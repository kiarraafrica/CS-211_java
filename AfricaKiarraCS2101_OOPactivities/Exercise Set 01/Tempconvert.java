package tempconvert;

import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Celcius value: ");
        double celcius = scanner.nextDouble();
        
        double fahrenheit = (celcius * 9/5) + 32;
        
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        
        scanner.close();
    }
}
