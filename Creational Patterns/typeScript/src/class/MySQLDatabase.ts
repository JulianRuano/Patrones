import { IDatabaseConnection } from "../interface/IDatabaseConnection";

// Clase que implementa la interfaz IDatabaseConnection
export class MySQLDatabase implements IDatabaseConnection {
    connect(): void {
        console.log("Conectando a la base de datos MySQL...");
    }

    disconnect(): void {
        console.log("Desconectando de la base de datos MySQL...");
    }
}