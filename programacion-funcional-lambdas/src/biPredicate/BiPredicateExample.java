package biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        /**
         * Bipredicate: recibe dos valore y regresa un booleano
         *
         */

        BiPredicate<Integer,Integer> biPredicate = (a,b) -> {
            return a > b;
        };

        boolean result = biPredicate.test(10,5);
        System.out.println(result);
    }
}
