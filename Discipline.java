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
public class Discipline {
     //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdDiscipline;
    private String nomdiscipline;
    
    //Constructeur 0
    public Discipline(){
        IdDiscipline = 0;
        nomdiscipline = null;
    }
    
    //Constructeur 1 
    public Discipline(int IdDiscipline){
        IdDiscipline = genID.getAndIncrement();
        nomdiscipline = null;
    }
    
    //Getters
    public int getIdDiscipline(){
        return IdDiscipline;
    }
    public String getappreciation(){
        return nomdiscipline;
    }
    
    
    //Setters
    public void setDiscipline(int newIdDiscipline){
        IdDiscipline = newIdDiscipline;
    }
    public void setDiscipline(String newnomdiscipline){
        nomdiscipline = newnomdiscipline;
    }
}
