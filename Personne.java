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
public class Personne {
     //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdPersonne;
    private String nom;
    public String prenom;
    
    //Constructeur 0
    public Personne(){
        IdPersonne = 0;
        nom = null;
        prenom = null;
    }
    
    //Constructeur 1 
    public Personne(int IdPersonne){
        IdPersonne = genID.getAndIncrement();
        nom = null;
        prenom = null;
    }
    
    //Getters
    public int getIdPersonne(){
        return IdPersonne;
    }
    public String getnom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    
    
    //Setters
    public void setPersonne(int newIdPersonne){
        IdPersonne = newIdPersonne;
    }
    public void setPersonnenom(String newnom){
        nom = newnom;
    }
    public void setPersonneprenom(String newprenom){
        prenom = newprenom;
    }
    
    
}
