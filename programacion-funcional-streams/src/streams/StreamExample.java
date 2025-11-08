package streams;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Fernando", "Juan", "Alejandro", "Ramon", "Julieta");

        //names.stream()
                //ForEach es un operador final, no se puede hacer nada despues de su uso
                /*.forEach((name)->{
                    System.out.println(name);
                });*/

                //Simplificacion
                //.forEach(System.out::println);

        //Filter(): Filtra los elementos que cumplen un condicion
        /*names.stream()
                //filter trabaja con Predicate
                .filter((name)-> name.length() > 4)
                .forEach(System.out::println);*/

        /**
         * map(): Tranforma los elementos aplicando una funcion:
         */
         //names.stream()
                 /*.map((name)->{
                     return name.toUpperCase();
                 }).forEach(System.out::println);*/
        //simplificando
                 /*.map(String::toUpperCase)
                 .filter((name) -> name.startsWith("A"))
                 .forEach(System.out::println);*/

        //Sorted(): Ordena los elementos del stream

        /*names.stream()
                .forEach((name)->{
                    //Consultas a bases
                });*/

        /*String result = names.stream()
                .reduce("Resultado: ",(a,b)->{
                    return a + " " + b;
                });*/

        //Reduce(): Combina todos los elementos en un solo valor
        /*String result= names.stream()
                        .reduce("resultado: " ,(a,b) -> a + " " + b);
        System.out.println(result);*/

        //Collect(): Recoge todos los elementos de un colecion
        /*List<String> result = names.stream()
                .map((name) -> name.toUpperCase())
                .collect(Collectors.toList());
        result.stream().forEach(System.out::println);*/

        //Distinct:
        /*names.stream()
                .distinct()
                .forEach(System.out::println);*/

        //Limit: limita el numero de elementos procesados
        /*names.stream()
                .limit(3)
                .forEach(System.out::println);*/


        //Skip: Omite un numero especifico de elementos
        /*names.stream()
                .skip(3)
                .forEach(System.out::println);*/


        //anyMatch(): verifica que si algun elemento cumple una condicion
        /*boolean result = names.stream()
                .anyMatch((name) ->{
                    return name.startsWith("J");
                });

        System.out.println(result);*/

        //Allmatch: verifica si todos los elementos cumplen una condicion
        /*boolean result = names.stream()
                .allMatch((name) ->{
                    return name.startsWith("J");
                });

        System.out.println(result);*/

        //None match(): verifica si ningun elemento cumple la condicion.
        // solamente es true si ninguno la cumple
        boolean result = names.stream()
                .noneMatch((name) -> name.length() == 10);

        System.out.println(result);


    }
}
