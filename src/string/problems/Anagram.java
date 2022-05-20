package string.problems;
import java.util.Arrays;[]
public class Anagram {
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String string1 = input.nextLine();
        System.out.println("Enter second word: ");
        String string2 = input.nextLine();

        if (string1.length()==string2.length()){
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean anagramCheck = Arrays.equals(charArray1, charArray2);

            if(anagramCheck){
                System.out.println(string1 + " and " + string2 + " are anagrams.");
            }else{
                System.out.println("These two words are not anagrams.");
            }
        }else{
            System.out.println("These two words are not anagrams.");
        }
        input.close();


    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }
}
