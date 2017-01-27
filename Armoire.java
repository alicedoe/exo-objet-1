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
public class Armoire extends Meuble {
    int hauteur;
        public Armoire() {
    
    List<PetitPied> listepieds = new ArrayList();
    List<Panneau> listepanneaux = new ArrayList();
    List<Porte> listeportes = new ArrayList();
    
        for (int i = 0; i < 4; i++) {
            PetitPied pp = new PetitPied();
            pp.couleur = "rouge";
            listepieds.add(pp);
        }
        for (int i = 0; i < 3; i++) {
            Panneau pn = new Panneau();
            pn.couleur = "rouge";
            listepanneaux.add(pn);

        }
        for (int i = 0; i < 2; i++) {
            Porte pt = new Porte();
            pt.couleur = "rouge";
            listeportes.add(pt);

        }
        
        
        this.hauteur = listepanneaux.get(0).hauteur + listepieds.get(0).hauteur;
    }

    @Override
    public int getHauteur() {
//        return this.hauteur;

        return this.hauteur;
    }
}
