package assignment;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        //Getting the scanner class to input a string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a name: ");

        String Name =  scanner.next();

        // Converting to uppercase

         Name = Name.toUpperCase();

        System.out.println(Name);

        // Using the stringbuilder to reverse the string

        String reversed = new StringBuilder(Name).reverse().toString();

        System.out.println( reversed);

        // Using the reverse code to check if the word is a palindrome

        if (reversed.equals(Name)) {

            System.out.println("Word is a Palindrome");

        }else
            System.out.println("It is not a Palindrome");

        // Code to check if the string contains any vowels and count them

        String word = Name;

        // Remember the string has be capitalized, and we need to change it back to lowercase

        word = Name.toLowerCase();

        int NumberOfVowels = 0;

        // Using the for loop to scan through the string

        for (int i = 0; i < word.length(); i++) {

            // Using char to assign character to the strings, then checking each character against the vowels

            char d = word.charAt(i);

            //Using if statement to compare each character of the string against all the vowels, during each iteration

            if (d == 'a'|| d == 'e' || d == 'i' || d == 'o' || d == 'u' ) {

                //If there is a match, the count for the number of vowels increases

                NumberOfVowels++;

            }
        }
        System.out.println("The number of vowels in the word is " + NumberOfVowels);

    }
}
