package Auto;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed); // по схеме задаются параметры (интежер)
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6; // проверка скорости
    }
}