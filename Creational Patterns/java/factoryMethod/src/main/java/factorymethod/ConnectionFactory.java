package factorymethod;

/**
 *
 * @author julianm
 */
public interface ConnectionFactory {
    IDatabaseConnection createConnection();
}
