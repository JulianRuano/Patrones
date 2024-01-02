package builder;

/**
 *
 * @author julian
 */
public class Main {
        public static void main(String[] args) {
            Director director = new Director();
            ICarBuilder builder = new CarBuilder();

            director.constructSportsCar(builder);
            
            Car car = builder.getResult(); 
            System.out.println("**************");  
            System.out.println("     Car");
            System.out.println("**************");
            System.out.println(car.getEngine().toString());
            System.out.println("Seats: "+car.getSeats());
            System.out.println(car.getGps().toString());
        }
    
}
