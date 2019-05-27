/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author margauxhery
 */
public class Trimestre {
        //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdTrimestre;
    private int IdAnneeScolaire;
    public Date Datedebut;
    public Date Datefin;
    
    //Constructeur 0
    public Trimestre(){
        IdTrimestre = 0;
        IdAnneeScolaire=0;
        Datedebut = null;
        Datefin = null;
    }
    
    //Constructeur 1 
    public Trimestre(int IdTrimestre, int IdAnneeScolaire, Date Datedebut, Date Datefin){
        IdTrimestre = genID.getAndIncrement();
        this.IdAnneeScolaire=IdAnneeScolaire;
        this.Datedebut = Datedebut;
        this.Datefin = Datefin;
    }
    
    //Getters et Setters
    public void setTrimestre(int newIdTrimestre){
        IdTrimestre = newIdTrimestre;
    }
    public void setTrimestreAS(int newIdAnneeScolaire){
        IdAnneeScolaire=newIdAnneeScolaire;
    }
    public void setTrimestredated(Date newDatedebut){
        Datedebut = newDatedebut;
    }
    public void setTrimestredatef(Date newDatefin){
        Datefin = newDatefin;
    }
    
    public int getIdTrimestre(){
        return IdTrimestre;
    }
    public int getIdAnneeScolaire(){
        return IdAnneeScolaire;
    }
    public Date getDatedebut(){
        return Datedebut;
    }
    public Date getDatefin(){
        return Datefin;
    }
}
