import java.util.*;

public class Practice {

    public static void main(String[] args) {


        boolean ret = isAnagram("anagramm", "marganaa");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){return false;}
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            String ch = String.valueOf(a.charAt(i));
            System.out.println(ch);
            b = b.replaceFirst(ch, "");
        }

        return b.isEmpty();


        }


    }
