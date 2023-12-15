package factorymethod;
import java.util.Scanner;

/**
 *
 * @author julianm
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de base de datos (1 para MySQL, 2 para Oracle): ");
        int op = scanner.nextInt();

        ConnectionFactory factory = null;

        switch (op) {
            case 1 -> factory = new MySQLConnectionFactory();
            case 2 -> factory = new OracleConnectionFactory();
            default -> {
                System.out.println("Opción no válida.");
                System.exit(0);
            }
        }

        IDatabaseConnection connection = factory.createConnection();
        connection.connect();
        connection.disconnect();
    }


}
