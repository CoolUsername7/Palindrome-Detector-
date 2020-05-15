public class PalindromeDetector
{
    private String s;

public PalindromeDetector()
{
    
}

public  String getString()
{
return s;
}

public void setString(String i)
{
    s = i;
}

public static int getLength(String s)
{
return s.length();
}
    public static boolean isPalindrome(String s){
        if(reverseString(s, getLength(s)).equalsIgnoreCase(s)){
           return true;
        }
       else if(reverseString(s, getLength(s)) != (s)){
            return false;
        }
        return isPalindrome(s); // <-- Tail-Recursive Statement
    }

    public static String reverseString(String s,int l){
        String reversed = "";
        for(int i = l - 1; i >= 0; i--) //fill String reversed with characters from s backwards
        {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}