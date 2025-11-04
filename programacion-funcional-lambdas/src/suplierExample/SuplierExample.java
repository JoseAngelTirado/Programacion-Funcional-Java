package suplierExample;

import java.util.function.Supplier;

public class SuplierExample {

    public static void main(String[] args) {
        /**
     * Suplier: no recibe nada pero retorna un resultado
     */

    Supplier<String> suplier = () -> {
        return "Hola soy u Supplier";
    };

    String result = suplier.get();
    System.out.println(result);

    }

}
