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
public class DetailsBulletin {
     //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdDetailsBulletin;
    private String appreciation;
    
    //Constructeur 0
    public DetailsBulletin(){
        IdDetailsBulletin = 0;
        appreciation = null;
    }
    
    //Constructeur 1 
    public DetailsBulletin(int IdDetailsBulletin){
        IdDetailsBulletin = genID.getAndIncrement();
        appreciation = null;
    }
    
    //Getters
    public int getIdDetailsBulletin(){
        return IdDetailsBulletin;
    }
    public String getappreciation(){
        return appreciation;
    }
    
    
    //Setters
    public void setDetailsBulletin(int newIdDetailsBulletin){
        IdDetailsBulletin = newIdDetailsBulletin;
    }
    public void setDetailsBulletin(String newappreciation){
        appreciation = newappreciation;
    }
    
    
}
