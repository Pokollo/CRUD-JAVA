package com.example;

import java.util.HashMap;


public class Crud {

    private HashMap<String, Integer> map = new HashMap<>();
    private String mensaje = "SE HA REALIZADO LA CONSULTA CON EXITO";
    Lector bf = new Lector();
    
    //Metodo para guardar usuarios
    //Method to save users
    public void guardar(){
        
        try {
            System.out.print("Ingrese nombre: ");
            String nombre = bf.lector();
            System.out.print("Ingrese telefono: ");
            int telefono = Integer.parseInt(bf.lector());
            if(!map.containsKey(nombre) && !map.containsValue(telefono)){
                map.put(nombre, telefono);
                System.out.println(mensaje);
            }else{
                System.out.println("YA EXISTE UN USUARIO CON ESE NOMBRE Y/O TELEFONO");
            }
            
            
        } catch (NumberFormatException e) {
            System.out.println("TELEFONO SOLO DEBE CONTENER NUMEROS, NI LETRAS, NI CARACTERES ESPECIALES");
        }
        
        
    }

    //Metodo para eliminar usuarios
    //Method to delete users
    public void eliminar(){
        System.out.print("Ingrese nombre que desea eliminar: ");
        String nombre = bf.lector();
        if(map.containsKey(nombre)){
            map.remove(nombre);
            System.out.println(mensaje);
        }else{
            System.out.println(nombre+" NO EXISTE EN LOS CONTACTOS");
        }
    } 

    //Metodo para editar usuarios
    //Method to update users
    public void editar(){
        System.out.print("Ingrese nombre que desea editar: ");
        String nombre = bf.lector();
        if(map.containsKey(nombre)){
            map.remove(nombre);
            this.guardar();
        }else{
            System.out.println(nombre+" NO EXISTE EN LOS CONTACTOS");
        }
    }

    //Metodo para buscar usuarios
    //Method to search users
    public void buscar(){
        System.out.print("Ingrese nombre que desea buscar: ");
        String nombre = bf.lector();
        if(map.containsKey(nombre)){
            System.err.println("Nombre:"+nombre+" || Telefono:"+map.get(nombre));
        }else{
            System.out.println(nombre+" NO EXISTE EN LOS CONTACTOS");
        }
    }

    //Metodo para listar usuarios
    //Method to list users
    public void listar(){
        if(!map.isEmpty()){
            for (String i : map.keySet()) {
                System.out.println("Nombre: "+i+" || Telefono: "+map.get(i));
            }
        }else{
            System.out.println("LA LISTA DE CONTACTOS ESTA VACIA");
        }
        
    
    }
}
