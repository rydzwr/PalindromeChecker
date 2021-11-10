package com.kodilla.palindrome;


import java.util.Locale;
import java.util.Scanner;

public class PalindromeApplication
{
    static Scanner scanner = new Scanner(System.in);

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    public static void main(String[] args)
    {
        System.out.println("Enter Word Or Sentence");
        String str = scanner.nextLine();
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase();

        if (PalindromeChecker.palindromeChecker(str))
            System.out.println("Yes, It's Palindrome!");

        else
            System.out.println("No, It's Not Palindrome!");
    }

}
