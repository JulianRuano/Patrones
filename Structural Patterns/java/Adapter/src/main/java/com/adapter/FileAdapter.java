package com.adapter;

/**
 *
 * @author julian
 */
public class FileAdapter implements IFileReader {
    private LegacyFileReader legacyFileReader;
    
    public FileAdapter(LegacyFileReader legacyFileReader) {
        this.legacyFileReader = legacyFileReader;
    }

    @Override
    public void readFile() {
        legacyFileReader.read("file.txt");
    }
    
}
