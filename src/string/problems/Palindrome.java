import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str) {
        int i = 0; int j = str.length() - 1;
        while (i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
       /*
         If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
         Palindrome. So write java code to check if a given String is Palindrome or not.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.next();
        str = str.toLowerCase();

        if(isPalindrome(str))
            System.out.println("This word is a palindrome.");
        else
            System.out.println("This word is not a palindrome.");

    }
}
