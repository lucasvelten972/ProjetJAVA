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
    private int IdClasse;
    private int IdDiscipline;
    private int IdPersonne;
    
    //Constructeur 0
    public Enseignement(){
        IdEnseignement = 0;
        IdClasse=0;
        IdDiscipline=0;
        IdPersonne=0;
    }
    
    //Constructeur 1 
    public Enseignement(int IdEnseignement, int IdClasse, int IdDiscipline, int IdPersonne){
        IdEnseignement = genID.getAndIncrement();
        this.IdClasse= IdClasse;
        this.IdDiscipline=IdDiscipline;
        this.IdPersonne=IdPersonne;
    }
    
    //Getters et Setters
    public void setEnseignement(int newIdEnseignement){
        IdEnseignement = newIdEnseignement;
    }
    public void setEnseignementCl(int newIdClasse){
        IdClasse= newIdClasse;
    }
    public void setEnseignementDisc(int newIdDiscipline){
        IdDiscipline= newIdDiscipline;
    }
    public void setEnseignementPers(int newIdPersonne){
        IdPersonne= newIdPersonne;
    }
    public int getIdEnseignement(){
        return IdEnseignement;
    }
}
