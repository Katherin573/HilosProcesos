/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author usuario
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread hilo = new Procesos ("proceso 1");
        Thread hilo2 = new Procesos ("proceso 2");
        
        hilo.start();
        hilo2.start();
    }
    
}
