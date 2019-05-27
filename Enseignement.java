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
public class Enseignement {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdEnseignement;
    
    //Constructeur 0
    public Enseignement(){
        IdEnseignement = 0;
    }
    
    //Constructeur 1 
    public Enseignement(int IdEnseignement){
        IdEnseignement = genID.getAndIncrement();
    }
    
    //Getters et Setters
    public void setEnseignement(int newIdEnseignement){
        IdEnseignement = newIdEnseignement;
    }
    public int getIdEnseignement(){
        return IdEnseignement;
    }
}
