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
public class Inscription {
        //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdInscription;
    
    //Constructeur 0
    public Inscription(){
        IdInscription = 0;
    }
    
    //Constructeur 1 
    public Inscription(int IdInscription){
        IdInscription = genID.getAndIncrement();
    }
    
    //Getters et Setters
    public void setInscription(int newIdInscription){
        IdInscription = newIdInscription;
    }
    public int getIdInscription(){
        return IdInscription;
    }
}
