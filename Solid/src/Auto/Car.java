package Auto;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed); // по схеме создание (интежер) из vehicle
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8; // проверка скорости 
    }
}