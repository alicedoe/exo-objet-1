/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo.objet.pkg1;

/**
 *
 * @author Ali
 */
public class ExoObjet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meuble table = new Table() ;
        System.out.println("hauteur : " + table.getHauteur() + " cm") ;
        
    }
    
}
