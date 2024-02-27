import { IDatabaseConnection } from "../interface/IDatabaseConnection";

export class OracleDatabase implements IDatabaseConnection {
    connect(): void {
        console.log('Conectando a la base de datos Oracle...');
    }
    disconnect(): void {
        console.log('Desconectando de la base de datos Oracle...');
    }
}