package service;

public interface EngineTransport {

     default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
