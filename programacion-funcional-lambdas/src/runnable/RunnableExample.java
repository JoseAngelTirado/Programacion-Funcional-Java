package runnable;

public class RunnableExample {
    public static void main(String[] args) {
        /**
         * Runable:
         * No recibe valores y no retorna nada, solo ejecuta una tarea
         */
        Runnable runnable = () ->{
            System.out.println("ejecutando tarea...");
        };

        runnable.run();
    }
}
