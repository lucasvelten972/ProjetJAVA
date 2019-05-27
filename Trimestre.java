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
    public Date Datedebut;
    public Date Datefin;
    
    //Constructeur 0
    public Trimestre(){
        IdTrimestre = 0;
        Datedebut = null;
        Datefin = null;
    }
    
    //Constructeur 1 
    public Trimestre(int IdTrimestre){
        IdTrimestre = genID.getAndIncrement();
        this.Datedebut = Datedebut;
        this.Datefin = Datefin;
    }
    
    //Getters et Setters
    public void setTrimestre(int newIdTrimestre){
        IdTrimestre = newIdTrimestre;
    }
    public void setTrimestre (Date newDatedebut){
        Datedebut = newDatedebut;
    }
    public void Trimestre(Date newDatefin){
        Datefin = newDatefin;
    }
    
    public int getIdTrimestre(){
        return IdTrimestre;
    }
    public Date getDatedebut(){
        return Datedebut;
    }
    public Date getDatefin(){
        return Datefin;
    }
}
