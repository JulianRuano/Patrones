package builder;

/**
 *
 * @author julian
 */
public class Car {
    private Engine engine;
    private GPS gps;
    private int seats;

    public Car(Engine engine, GPS gps, int seats) {
        this.engine = engine;
        this.gps = gps;
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPS getGps() {
        return gps;
    }

    public int getSeats() {
        return seats;
    }
}
