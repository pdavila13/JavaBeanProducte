/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeanproducte;

import beansmeus.PrimerBean;
import beansmeus.Receptor;
import beansmeus.ReceptorVetador;
import java.beans.PropertyVetoException;

/**
 *
 * @author pdavila
 */
public class JavaBeanProducte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PropertyVetoException {
        
        PrimerBean b = new PrimerBean();
        Receptor r = new Receptor();
        ReceptorVetador rv = new ReceptorVetador();
        
        // Registro al receptor com a un listener de l'objecte PrimerBean
        b.addPropertyChangeListener(r);
        b.addVetoableChangeListener(rv);
        
        /**
         * STOCK ACTUAL
         * 
         * Ficar -1 com a valor de la propietat stock_actual
         */
        System.out.println("\nIntent de canvi a la propietat stock actual.");
        System.out.println("Valor actual: " + b.getStock_actual());
        System.out.println("Nou valor: -1");
        try {
            b.setStock_actual(-1);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        // Ficar 0 com a valor de la propietat stock_actual
        System.out.println("\nIntent de canvi a la propietat stock actual.");
        System.out.println("Valor actual: " + b.getStock_actual());
        System.out.println("Nou valor: 0");
        try {
            b.setStock_actual(0);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        // Ficar 25 com a valor de la propietat stock_actual
        System.out.println("\nIntent de canvi a la propietat stock actual.");
        System.out.println("Valor actual: " + b.getStock_actual());
        System.out.println("Nou valor: 25");
        try {
            b.setStock_actual(25);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!\n");
        }
        
        System.out.println("\n\n");
        
        
        /**
         * STOCK MINIMO
         * 
         * Ficar -1 com a valor de la propietat stock_minim
         */
        System.out.println("\nIntent de canvi a la propietat stock mínim.");
        System.out.println("Valor actual: " + b.getStock_minim());
        System.out.println("Nou valor: -1");
        try {
            b.setStock_minim(-1);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        // Ficar 0 com a valor de la propietat stock_minim
        System.out.println("\nIntent de canvi a la propietat stock mínim.");
        System.out.println("Valor actual: " + b.getStock_minim());
        System.out.println("Nou valor: 0");
        try {
            b.setStock_minim(0);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!\n");
        }
        
        // Ficar 25 com a valor de la propietat stock_minim
        System.out.println("\nIntent de canvi a la propietat stock mínim.");
        System.out.println("Valor actual: " + b.getStock_minim());
        System.out.println("Nou valor: 25");
        try {
            b.setStock_minim(25);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        System.out.println("\n\n");
        
        /**
         * PREU DE VENTA AL PUBLIC
         * 
         * Ficar -1 com a valor de la propietat PVP
         */
        System.out.println("\nIntent de canvi a la propietat PVP.");
        System.out.println("Valor actual: " + b.getPvp());
        System.out.println("Nou valor: -1");
        try {
            b.setPvp(-1);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        // Ficar 0 com a valor de la propietat PVP
        System.out.println("\nIntent de canvi a la propietat PVP.");
        System.out.println("Valor actual: " + b.getPvp());
        System.out.println("Nou valor: 0");
        try {
            b.setPvp(0);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!");
        }
        
        // Ficar 25 com a valor de la propietat PVP
        System.out.println("\nIntent de canvi a la propietat PVP.");
        System.out.println("Valor actual: " + b.getPvp());
        System.out.println("Nou valor: 25");
        try {
            b.setPvp(25);
        } catch (PropertyVetoException ex) {
            System.out.println("No s'ha permés el canvi!!!\n");
        }
        
        System.out.println("\n\n");
        
        /**
         * ANY DE FABRICACIO
         */
        System.out.println("\nIntent de canvi a la propietat Any de fabricació.");
        System.out.println("Valor actual: " + b.getAny_fabricacio());
        System.out.println("Nou valor: " + b.getAny_fabricacio());
        b.setAny_fabricacio(2024);
        
        System.out.println("\nIntent de canvi a la propietat Any de fabricació.");
        System.out.println("Valor actual: " + b.getAny_fabricacio());
        System.out.println("Nou valor: " + b.getAny_fabricacio());
        b.setAny_fabricacio(2010);
    }
    
}
