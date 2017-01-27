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
public class Table extends Meuble {

    int hauteur;
    List<Pied> pieds = new ArrayList();

    public Table() {
        Plateau plateau = new Plateau();
        plateau.couleur = "rouge";
        for (int i = 0; i < 4; i++) {
            Pied pied = new Pied();
            pied.couleur = "rouge";
            pieds.add(pied);

        }
        this.hauteur = plateau.hauteur + pieds.get(0).hauteur;
    }

    @Override
    public int getHauteur() {
//        return this.hauteur;

        return this.hauteur;
    }
}
