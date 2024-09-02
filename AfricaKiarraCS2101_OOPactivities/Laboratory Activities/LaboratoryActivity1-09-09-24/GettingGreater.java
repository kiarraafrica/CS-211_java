package gettinggreater;

import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        
        System.out.print("Enter first character: ");
        char char1 = input.next().charAt(0);
        int asciiValue1 = (int) char1;
        System.out.print("Enter second character: ");
        char char2 = input.next().charAt(0);
        int asciiValue2 = (int) char2;
        
        int higher = Math.max(asciiValue1, asciiValue2);
        char higherChar = (char) higher;
        
        System.out.println("\n");
        
        System.out.println("-".repeat(40));
        System.out.println("The character with greater value is: " + higherChar);
        System.out.println("-".repeat(40));
        
        System.out.println("Showing the ASCII Codes");
        
        System.out.println(char1 + " : " + asciiValue1);
        System.out.println(char2 + " : " + asciiValue2);
        
        input.close();
    }
}
