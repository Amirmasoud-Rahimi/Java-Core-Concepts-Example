package innerclass;

public class Car {
    private String carName;
    private String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    protected class Engine {
        String engineType;

        void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        String getEngineType() {
            return this.engineType;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Bugati", "Sport");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Hybrid");
        System.out.println(engine.getEngineType());
    }
}