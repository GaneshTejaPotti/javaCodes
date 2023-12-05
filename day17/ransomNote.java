package day17;
import java.util.*;
public class ransomNote {
    public static void main(String [] args)
    {
        /*
        Given two strings ransomNote and magazine, return true if ransomNote 
        can be constructed by using the letters from magazine and false otherwise.
        
        Example 1:

        Input: ransomNote = "a", magazine = "b"
        Output: false
        Example 2:

        Input: ransomNote = "aa", magazine = "ab"
        Output: false
        Example 3:

        Input: ransomNote = "aa", magazine = "aab"
        Output: true

         */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(canConstruct(str1,str2));
        sc.close();
    }

    public static boolean canConstruct(String str1, String str2)
    {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            hm1.put(str1.charAt(i),hm1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++)
        {
            hm2.put(str2.charAt(i),hm2.getOrDefault(str2.charAt(i),0)+1);
        }
        for(int i=0;i<str1.length();i++)
        {
            if(hm2.containsKey(str1.charAt(i)) && hm2.get(str1.charAt(i))>0)
            {
                hm2.put(str1.charAt(i),hm2.get(str1.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
