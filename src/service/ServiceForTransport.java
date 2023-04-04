package service;

public interface ServiceForTransport {

    void service();

    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    int getWheelsCount();

    default void updateAllTires() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }


}
