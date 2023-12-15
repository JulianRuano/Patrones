package factorymethod;

/**
 *
 * @author julianm
 */
public class MySQLConnectionFactory implements ConnectionFactory {

    @Override
    public IDatabaseConnection createConnection() {
        return new MySQLDatabase();
    }
    
}
