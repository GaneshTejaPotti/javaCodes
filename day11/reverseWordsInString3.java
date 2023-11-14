package day11;
import java.util.*;
public class reverseWordsInString3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverseWords(s);
        System.out.println(ans);
        sc.close();
    }

    public static String reverseWords(String s)
    {
        StringBuilder reverseFull = new StringBuilder();
        String[] words = s.split("\\s+");
        for(String word : words)
        {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            reverseFull.append(reverseWord).append(" ");
        }
        return reverseFull.toString().trim();
    }
}
