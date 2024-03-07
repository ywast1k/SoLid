// package Auto;
// 
// import ENGIN.PetrolEngine;
// import Interface.Engine;
// 
// public class Car extends Vehicle{
//     public Car(int maxSpeed) {
//         super(maxSpeed); // по схеме создание (интежер) из vehicle
//     }
// 
//     @Override
//     public double calculateAllowedSpeed() {
//         return getMaxSpeed() * 0.8; // проверка скорости 
//     }
// 



package Auto;

import Interface.Engine;

public class Car extends Vehicle{
    private Engine engine;

    public Car(int maxSpeed, Engine engine) {
        super(maxSpeed); // по схеме создание (интежер) из vehicle
        this.engine = engine;
    }

    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8; // проверка скорости 
    }

    public void start() {
        this.engine.start();
    }
}