/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author julianm
 */
public class MySQLDatabase implements IDatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Conectando a la base de datos MySQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de la base de datos MySQL...");
    }
    
}
