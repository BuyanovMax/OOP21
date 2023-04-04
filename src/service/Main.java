package service;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[6];
        transports[0] = new Car("car1",4);
        transports[1] = new Car("car2",4);
        transports[2] = new Truck("truck1",6);
        transports[3] = new Truck("truck2",8);
        transports[4] = new Bicycle("bicycle1",2);
        transports[5] = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < transports.length; i++) {
            station.check(transports[i]);
        }
    }
}