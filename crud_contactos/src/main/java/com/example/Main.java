package com.example;

public class Main {
    public static void main(String[] args){

       Lector bf;
       Crud crud;
        
       do{
        try{
                bf = new Lector();
                crud = new Crud();
                while(true){
                    System.out.println("***** MENU *****");
                    System.out.println("1. Guardar");
                    System.out.println("2. Eliminar");
                    System.out.println("3. Editar");
                    System.out.println("4. Buscar");
                    System.out.println("5. Listar");
                    System.out.println("6. Salir");
                    System.out.print("Seleccione una opcion de acuerdo a su necesidad: ");

                    int opcion=Integer.parseInt(bf.lector());
                    switch (opcion) {
                        case 1 -> crud.guardar();
                        case 2 -> crud.eliminar();
                        case 3 -> crud.editar();
                        case 4 -> crud.buscar();
                        case 5 -> crud.listar();
                        case 6 -> System.exit(0);
                        default -> throw new AssertionError();
                    }                   
                }
            }catch(AssertionError e){
                System.out.println("SOLO NUMEROS DEL 1 AL 6");
            }
        }while(true);
    }
}