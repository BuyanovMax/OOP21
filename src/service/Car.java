package service;

public class Car extends Transport implements EngineTransport{


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateAllTires();
        checkEngine();
    }


}
