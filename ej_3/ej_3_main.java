package ej_3;

public class ej_3_main {
    public static void main(String[] args) {
       // Elementos prueba 
       int[] li_1= {12, 3, 6, 24, 31, 57, 9, 36};
       int[] li_2= {1, 23, 5, 154, 21, 43};
       int[] li_3= {2, 31, 56, 76, 77, 78, 79, 1023};
       int[] li_4= {28, 35, 1, 24, 57, 9};
       int[] li_5= {56, 62, 53, 65, 1998, 34, 2, 10};

       int[][] results = {li_1,li_2,li_3,li_4,li_5};
       for(int[] l : results){
        int aux = ej_3_logic.exercise3Logic(l);
        System.out.println(aux);
       }
    }


    /*
              Expected output --
                                4
                                1
                                2
                                2
                                1
     */
}
