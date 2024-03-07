package Auto;

public abstract class Vehicle {
    protected int maxSpeed;
// работа с Авто. Задаем число макс скорость для отправки в Car и Bus
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed; // в инт храним макс скорость 
    }
// Вывод гет.
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public abstract double calculateAllowedSpeed();
}

