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
    private int IdBulletin;
    private int IdEnseignement;
    private String appreciation;
    
    //Constructeur 0
    public DetailsBulletin(){
        IdDetailsBulletin = 0;
        IdBulletin = 0;
        IdEnseignement=0;
        appreciation = null;
    }
    
    //Constructeur 1 
    public DetailsBulletin(int IdDetailsBulletin, int IdBulletin, int IdEnseignement){
        IdDetailsBulletin = genID.getAndIncrement();
        this.IdBulletin= IdBulletin;
        this.IdEnseignement=IdEnseignement;
        appreciation = null;
    }
    
    //Getters
    public int getIdDetailsBulletin(){
        return IdDetailsBulletin;
    }
    public int getIdBulletin(){
        return IdBulletin;
    }
    public int getIdEnseignement(){
        return IdEnseignement;
    }
    public String getappreciation(){
        return appreciation;
    }
    
    
    //Setters
    public void setDetailsBulletin(int newIdDetailsBulletin){
        IdDetailsBulletin = newIdDetailsBulletin;
    }
    public void setDetailsBulletinBul(int newIdBulletin){
        IdBulletin= newIdBulletin;
    }
    public void setDetailsBulletinEns(int newIdEnseignement){
        IdEnseignement= newIdEnseignement;
    }
    public void setDetailsBulletin(String newappreciation){
        appreciation = newappreciation;
    }
}
