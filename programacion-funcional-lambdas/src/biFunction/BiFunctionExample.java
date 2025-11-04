package biFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        /**
         * Recibe dos valores y retorna un resultado
         */

        //Declaramos los dos valores que recibimos y el que retornamos
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> {

            return a + b;
        };

        int result = biFunction.apply(10, 20);
        System.out.println(result);
    }

}
