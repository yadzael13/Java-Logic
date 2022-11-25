package ej_5;

import java.util.HashMap;

public class ej_5_main {
    public static void main(String[] args) {
        

        HashMap<String, String> p = new HashMap<>();

        String word;


        // Exercise - 1
        p.put("Malawi", "yes");
        p.put("Source", "No");
        p.put("Alquiler", "Conv");
        p.put("Producto", "Tuna");

        word = "Source";
        System.out.println("ej-1\n"+ej_5_logic.exercise5Logic(p, word));
        p.clear(); 

        // Exercise - 2
        p.put("Week", "yes");
        p.put("Alt", "No");
        p.put("Qwerty", "Conv");
        p.put("Season", "Tuna");
        p.put("Verdanks", "12321");
        p.put("Motive", "a_sqwe");

        word = "No";
        System.out.println("ej-2\n"+ej_5_logic.exercise5Logic(p, word));
        p.clear(); 

        // Exercise - 3
        p.put("q", "yes");
        p.put("w", "No");
        p.put("f", "Conv");
        p.put("a", "Tuna");
        p.put("s", "12321");
        p.put("d", "a_sqwe");

        word = "12321";
        System.out.println("ej-3\n"+ej_5_logic.exercise5Logic(p, word));
        p.clear(); 

         // Exercise - 4
         p.put("ww", "yes");
         p.put("2s", "No");
         p.put("12w", "Conv");
         p.put("3", "Tuna");
         p.put("44", "12321");
         p.put("gh", "a_sqwe");
 
         word = "12w";
         System.out.println("ej-4\n"+ej_5_logic.exercise5Logic(p, word));
         p.clear(); 

         // Exercise - 5
         p.put("fuego", "yes");
         p.put("aire", "No");
         p.put("tierra", "Conv");
         p.put("agua", "Tuna");
         p.put("arena", "12321");
         p.put("lodo", "a_sqwe");
 
         word = "Tierra";
         System.out.println("ej-5\n"+ej_5_logic.exercise5Logic(p, word));
         
        // Exercise - 6
 
         word = "tierra";
         System.out.println("ej-6\n"+ej_5_logic.exercise5Logic(p, word));
         p.clear(); 

    }
}


                /**   Expected output -- 
                 * true
                 * false
                 * false
                 * true
                 * false
                 * true
                */