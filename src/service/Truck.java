package service;

public class Truck extends Transport implements EngineTransport {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateAllTires();
        checkEngine();
        checkTrailer();

    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
