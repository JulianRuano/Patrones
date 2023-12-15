/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author julianm
 */
public class OracleConnectionFactory implements ConnectionFactory {

    @Override
    public IDatabaseConnection createConnection() {
        return new OracleDatabase();
    }
    
}
