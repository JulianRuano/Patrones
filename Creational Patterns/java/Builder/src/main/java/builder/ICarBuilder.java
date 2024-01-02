package builder;

/**
 *
 * @author julian
 */
public interface ICarBuilder {
    void setEngine(Engine engine);
    void setGPS(GPS gps);
    void setSeats(int seats);
    Car getResult();
}
