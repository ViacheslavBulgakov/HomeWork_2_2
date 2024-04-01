package HW_2_2;

public class Truck extends Vehicle {
    private String modelName;
    private int wheelsCount;
    private int engine;
    private int trailer;

    public Truck(String modelName, int wheelsCount, int engine, int trailer) {
        super(modelName, wheelsCount);
        this.engine = engine;
        this.trailer = trailer;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getTrailer() {
        return trailer;
    }

    public void setTrailer(int trailer) {
        this.trailer = trailer;
    }

}
