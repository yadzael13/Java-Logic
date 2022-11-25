package ej_1;

public class ej_1_main {
    public static void main(String[] args) {

        //Prueba de varios elementos
        int[] prueba_ex1= {5, 8, 13, 20, 100, 24, 56, 501};
        for(int el : prueba_ex1){
            int aux = ej_1_logic.exercise1Logic(el);
            System.out.println(aux);
        }
        //Expected Result -- 
        // 2   4   6   10    50    12    28    250
    }
}
