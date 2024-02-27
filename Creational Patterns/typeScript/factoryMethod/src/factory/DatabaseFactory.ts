import { IDatabaseConnection } from "../interface/IDatabaseConnection";
import { MySQLDatabase } from "../class/MySQLDatabase";
import { OracleDatabase } from "../class/OracleDatabase";

export class DatabaseFactory {
    createDatabaseConnection(tipo: string): IDatabaseConnection {
        switch (tipo) {
            case 'MySQL':
                return new MySQLDatabase();
            case 'Oracle':
                return new OracleDatabase();
            default:
                throw new Error('Tipo de base de datos no soportada.');
        }
    }
}