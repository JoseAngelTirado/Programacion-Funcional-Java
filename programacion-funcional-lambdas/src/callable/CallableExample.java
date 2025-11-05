package callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        /**
         * Callable:
         * No recibe valores, pero retorna un resultado y puede lanzar un excepcion
         */

        Callable<String> callable = () -> "Resultado de la tarea";

        /**
         * Si no se retorna un el resultado de callable.call
         * manejamos el error con catch
         */
        try {
            String result = callable.call();
            System.out.println(result);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
