/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author margauxhery
 */
public class AnneeScolaire {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdAnneeScolaire;
    
    //Constructeur 0
    public AnneeScolaire(){
        IdAnneeScolaire = 0;
    }
    
    //Constructeur 1 
    public AnneeScolaire(int IdAnneeScolaire){
        IdAnneeScolaire = genID.getAndIncrement();
    }
    
    //Getters et Setters
    public void setAnneeScolaire(int newIdAnneeScolaire){
        IdAnneeScolaire = newIdAnneeScolaire;
    }
    public int getIdAnneeScolaire(){
        return IdAnneeScolaire;
    }
}

   