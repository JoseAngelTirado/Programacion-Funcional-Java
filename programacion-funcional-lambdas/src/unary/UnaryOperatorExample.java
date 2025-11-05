package unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /**
         * Recibe un solo valor, lo preocesa y devuelve un resultado del miso tipo
         */

        /*UnaryOperator<Integer> unaryOperator = (number) -> {
            return number * number;
        };*/

        UnaryOperator<Integer> unaryOperator = (number) -> number * number;

        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}
