package biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        /**
         * Biconsumer: Recibe dos valores y no recibe nada 
         */
        /*BiConsumer<String, String> biconsumer = (a,b) -> {
            System.out.println(a + " " +b);*/

        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println(a + " " + b);
        
        biConsumer.accept("Hola", "Mundo");


    }

}
