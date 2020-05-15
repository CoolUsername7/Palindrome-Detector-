import java.util.Scanner;

public class PalindromeDetectorDemo{
    public static void main (String [] args){
     Scanner keyboard = new Scanner(System.in);

     System.out.println("Enter a String: ");
     String s = keyboard.nextLine();
     s.replace(" ","");

        PalindromeDetector palindrome = new PalindromeDetector();
        palindrome.setString(s);

        System.out.println(palindrome.isPalindrome(s));


    }


}