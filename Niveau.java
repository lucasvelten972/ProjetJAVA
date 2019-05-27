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
public class Niveau {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdNiveau;
    private String nom;
    
    //Constructeur 0
    public Niveau(){
        IdNiveau = 0;
        nom = null;
    }
    
    //Constructeur 1 
    public Niveau(int IdNiveau, String nom){
        IdNiveau = genID.getAndIncrement();
        nom = null;
    }
    
    //Getters
    public int getIdNiveau(){
        return IdNiveau;
    }
    public String getnom(){
        return nom;
    }
    
    
    //Setters
    public void setNiveaue(int newIdNiveau){
        IdNiveau = newIdNiveau;
    }
    public void setNiveau(String newnom){
        nom = newnom;
    }
    
    
}
