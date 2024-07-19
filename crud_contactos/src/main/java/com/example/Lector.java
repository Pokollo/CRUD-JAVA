package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lector {
    
    private BufferedReader bf;


    //Metodo para leer desde la terminal
    //Method to read from the terminal
    public String lector(){
        
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            return bf.readLine();
        }catch(IOException e){
            return null;
        }
        

    }

}
