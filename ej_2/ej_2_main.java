package ej_2;

public class ej_2_main {
    public static void main(String[] args) {
        // elementos para prueba
        int[] t1 = {20, 20, 20, 20};
        int[] t2 = {10, 51, 10, 51}; 
        int[] t3 = {12, 54, 54, 12};
        int[] t4 = {5, 12, 98, 12};
        int[] t5 = {10, 10, 10, 10};

        int[][] results = {t1, t2, t3, t4, t5};
        
        
        for(int[] arr_el : results){
            int a,b,c,d;
            a= arr_el[0];
            b= arr_el[1];
            c= arr_el[2];
            d= arr_el[3];
            String aux = ej_2_logic.exercise2Logic(a, b, c, d);
            System.out.println(aux);
        }
    }


            /*Expected Output ---- 
                                Cuadrado
                                Rectangulo
                                Rectangulo
                                Irregular
                                Cuadrado
              */                
}
