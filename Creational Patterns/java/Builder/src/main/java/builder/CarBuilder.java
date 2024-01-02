package builder;

/**
 *
 * @author julian
 */
public class CarBuilder implements ICarBuilder{

    private Engine engine;
    private GPS gps;
    private int seats;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;    
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(engine, gps, seats);
    }

    
}
