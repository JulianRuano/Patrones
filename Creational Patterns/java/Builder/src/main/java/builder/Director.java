package builder;

/**
 *
 * @author julian
 */
public class Director {

    public void constructSportsCar(ICarBuilder builder) {
        builder.setEngine(new Engine("V8", 400));
        builder.setGPS(new GPS("0.0.1"));
        builder.setSeats(2);
    }

    public void constructSUV(ICarBuilder builder) {
        builder.setEngine(new Engine("V6", 250));
        builder.setGPS(new GPS("0.0.1"));
        builder.setSeats(4);
    }

    public void constructCityCar(ICarBuilder builder) {
        builder.setEngine(new Engine("V4", 150));
        builder.setGPS(new GPS("0.0.1"));
        builder.setSeats(4);
    }
    
}
