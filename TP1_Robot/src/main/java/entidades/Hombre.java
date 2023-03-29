
package entidades;

import java.util.Scanner;
/**
 *
 * @author VIB
 */


public class Hombre {
    
    private String nombre;

    public Hombre() {
    }
    

    public Hombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void jugarConRobot(Robot robotito){
         Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese su nombre");
         this.nombre = scan.nextLine();
         System.out.println("Bienvenid@ "+ this.nombre);
         
         int op;
        
        
        do {
            
            System.out.println("____________________________");
            System.out.println("Hola Humano que dea hacer?");
            System.out.println("1) Avanzar");
            System.out.println("2) Retroceder");
            System.out.println("3) Recargar");
            System.out.println("4) bateriaLlena");
            System.out.println("5) bateriaVacia");
            System.out.println("6) energiaActual");
            System.out.println("7) Dormir");
            System.out.println("8) Despertar");
            op = scan.nextInt();
            System.out.println("________________________ ");
            
            
            
            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese cantidad de pasos");
                    double cantidadA = scan.nextDouble();
                    robotito.avanzar(cantidadA);
                    
                    System.out.println("________________________");
                 }
                    
                case 2 -> {
                    System.out.println("¿ Cuantos pasos quiere que retroceda el robot ?");
                    int cantidadR = scan.nextInt();
                    robotito.retroceder(cantidadR);
                    System.out.println("_____________________________ ");
                 }
                    
                case 3 -> {
                    System.out.println("Recargando...");
                    robotito.recargar();                  
                    System.out.println("___________________________ ");
                 }
                case 4 -> {
                    System.out.println("Su bateria se esta llenando " +robotito.bateriaLlena());
                    System.out.println("_________________________ ");
                 }
                case 5 -> {
                    System.out.println("Bateria sin carga "+robotito.bateriaVacia());
                    System.out.println("_________________________ ");
                 }
                
                case 6 -> System.out.println("la energia actual de su  "/*+robotito.getModelo*/  +robotito.energiaActual());
                    
                case 7 -> robotito.dormir();
                                  
                    
                case 8 -> robotito.despertar();
                
                    
                    

                default -> System.out.println("Opcion incorrecta.");
                    
                
                    
            }
            
            
        } while (op != 7);
    }
}
    
