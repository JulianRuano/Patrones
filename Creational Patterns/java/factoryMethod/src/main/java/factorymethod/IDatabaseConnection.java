package factorymethod;

/**
 *
 * @author julianm
 */
// Interfaz que define el comportamiento para la conexión a la base de datos
public interface IDatabaseConnection {
    void connect();
    void disconnect();
}
