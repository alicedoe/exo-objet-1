/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo.objet.pkg1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali
 */
public class ExoObjet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Meuble> meubles = new ArrayList() ;
        Meuble table = new Table() ;
        Meuble armoire = new Armoire() ;
        meubles.add(table);
        meubles.add(armoire);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("hauteur : " + meubles.get(i).getHauteur() + " cm") ;

        }
        
    }
    
}
