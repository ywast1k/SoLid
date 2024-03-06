import Auto.Vehicle;

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed(); // проверяет тип транспорта и возвращает разрешенную скорость В зависимости от авто
    }
}

// При добавке новых машин не нужно менять данный класс ОСР