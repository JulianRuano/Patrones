// Interfaz que define el comportamiento para la conexión a la base de datos
export interface IDatabaseConnection {
    connect(): void;
    disconnect(): void;
}

