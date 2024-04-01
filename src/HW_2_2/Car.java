package HW_2_2;

public class Car extends Vehicle {
    private String modelName;
    private int wheelsCount;
    private int engine;

    public Car(String modelName, int wheelsCount, int engine) {
        super(modelName, wheelsCount);
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
