package builder;

/**
 *
 * @author julian
 */
public class GPS {
    private String location;

    public GPS(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "GPS{ " + "location=" + location + " }";
    }
    
}
