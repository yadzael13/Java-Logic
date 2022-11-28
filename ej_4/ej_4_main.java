package ej_4;

import java.util.*;

public class ej_4_main {
    public static void main(String[] args) {
        
        List<List<Integer>> proof = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(3);a.add(3);a.add(8);
        b.add(6);b.add(7);b.add(9);
        c.add(12);c.add(56);c.add(2);

        proof.add(a);proof.add(b);proof.add(c);
        System.out.println("Prueba 1 ----");
        System.out.println(ej_4_logic.exercise4Logic(proof)+"\n\n");
        proof.clear(); a.clear(); b.clear(); c.clear();

        a.add(24);a.add(7);a.add(10);
        b.add(9);b.add(1);b.add(8);
        c.add(10);c.add(3);c.add(45);

        proof.add(a);proof.add(b);proof.add(c);
        System.out.println("Prueba 2 ----");
        System.out.println(ej_4_logic.exercise4Logic(proof)+"\n\n");
        proof.clear(); a.clear(); b.clear(); c.clear();

        a.add(4);a.add(12);a.add(18);
        b.add(2);b.add(6);b.add(2);
        c.add(9);c.add(22);c.add(7);

        proof.add(a);proof.add(b);proof.add(c);
        System.out.println("Prueba 1 ----");
        System.out.println(ej_4_logic.exercise4Logic(proof)+"\n\n");
    }
}


                        /** 
                         * Expected Output
                         * 
                         * Prueba 1 -
                         * [12,27]
                         * 
                         * Prueba 2 -
                         * [70, 21]
                         * 
                         * Prueba 3 -
                         * [17,33]
                        */