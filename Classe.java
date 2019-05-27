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
public class Classe {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdClasse;
    private int IdNiveau;
    private int IdAnneeScolaire;
    private String nom;
    
    //Constructeur 0
    public Classe(){
        IdClasse = 0;
        IdNiveau = 0;
        IdAnneeScolaire=0;
        nom = null;
    }
    
    //Constructeur 1 
    public Classe(int IdClasse, int IdAnneeScolaire, int IdNiveau){
        IdClasse = genID.getAndIncrement();
        this.IdAnneeScolaire=IdAnneeScolaire;
        this.IdNiveau=IdNiveau;
        nom = null;
    }
    
    //Getters
    public int getIdClasse(){
        return IdClasse;
    }
    public int getIdNiveau(){
        return IdNiveau;
    }
    public int getAnneeScolaire(){
        return IdAnneeScolaire;
    }
    public String getnom(){
        return nom;
    }
    
    
    //Setters
    public void setClasse(int newIdClasse){
        IdClasse = newIdClasse;
    }
    public void setClasseNiv(int newIdNiveau){
        IdNiveau = newIdNiveau;
    }
    public void setClasseAS(int newIdAnneeScolaire){
        IdAnneeScolaire = newIdAnneeScolaire;
    }
    public void setClasse(String newnom){
        nom = newnom;
    }
    
    
    
}

  
