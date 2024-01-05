package com.proxy;

/**
 *
 * @author julian
 */
public class Main {
        public static void main(String[] args) {
            Subject realSubject = new Subject();
            Proxy proxy = new Proxy(realSubject, "admin");
            proxy.request();

            // El proxy puede controlar el acceso a los métodos del sujeto
            Proxy proxy2 = new Proxy(realSubject, "user");
            proxy2.request();
        }
    
}
