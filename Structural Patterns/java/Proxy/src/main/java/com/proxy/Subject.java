package com.proxy;

/**
 *
 * @author julian
 */
public class Subject implements ISubject{
    
        @Override
        public void request() {
            System.out.println("Subject: Handling request.");
        }
    
}
