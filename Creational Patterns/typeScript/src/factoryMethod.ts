import { DatabaseFactory } from './factory/DatabaseFactory';

// Uso del patrón Factory Method
const factory = new DatabaseFactory();

const mysql = factory.createDatabaseConnection('MySQL');
mysql.connect();
mysql.disconnect();

console.log("--------------------------------------------------");

const oracle = factory.createDatabaseConnection('Oracle');
oracle.connect();
oracle.disconnect();


