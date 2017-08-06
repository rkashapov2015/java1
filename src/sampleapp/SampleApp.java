/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp;

import java.io.IOException;
/**
 *
 * @author Rinat
 */
public class SampleApp {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Sender sender = new Sender("http://clickhouse/test/data");
        String result = sender.getRequest();
        
    }
    
}
