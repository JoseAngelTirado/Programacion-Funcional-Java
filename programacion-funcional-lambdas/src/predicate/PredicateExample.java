package predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /**Recibe un valor y devuelve un bool */

        Predicate<String> predicate = (str) ->{

            return str.length() > 5;
        };
        boolean result = predicate.test("Hola Mundo");
        System.out.println(result);
    }

}
