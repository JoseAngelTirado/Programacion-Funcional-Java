package lambdasConsumer;

//Consumer permite usar lambdas, importando la interfaz funcional Consumer, la cual toma un objeto como entrada realiza alguna accion sobre pero no devuelve nada
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        
        /*
         * Consumer: Recibe un valor y no retorna nada
         * No us return estrictamente
         */


        //Declaramos Consumer que recibe el tipo de dato String
        //Tres maneras de declarar el Conumer y la impresion del parametro

        /*Consumer<String> consumer = (param) -> {
            System.out.println(param);
        };*/

        //Consumer<String> consumer = (param) -> System.out.println(param);

        //La forma de los :: solo funciona para un parametro
        Consumer<String> consumer = System.out::println;

        consumer.accept("Jose");
    }

}
