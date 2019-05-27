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
    private int IdClasse;
    private int IdPersonne;
    
    //Constructeur 0
    public Inscription(){
        IdInscription = 0;
        IdClasse=0;
        IdPersonne=0;
    }
    
    //Constructeur 1 
    public Inscription(int IdInscription, int IdClasse, int IdPersonne){
        IdInscription = genID.getAndIncrement();
        this.IdClasse=IdClasse;
        this.IdPersonne=IdPersonne;
        
    }
    
    //Getters et Setters
    public void setInscription(int newIdInscription){
        IdInscription = newIdInscription;
    }
    public void setInscriptionCl(int newIdClasse){
        IdClasse=newIdClasse;
    }
    public void setInscriptionPers(int newIdPersonne){
        IdPersonne=newIdPersonne;
    }
    public int getIdInscription(){
        return IdInscription;
    }
    public int getIdClasse(){
        return IdClasse;
    }
    public int getIdPersonne(){
        return IdPersonne;
    }
}
