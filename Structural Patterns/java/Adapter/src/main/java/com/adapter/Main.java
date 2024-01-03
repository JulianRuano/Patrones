package com.adapter;

/**
 *
 * @author julian
 */
public class Main {
    public static void main(String[] args) {
        IFileReader fileReader = new FileAdapter(new LegacyFileReader());
        fileReader.readFile();
    }
    
}
