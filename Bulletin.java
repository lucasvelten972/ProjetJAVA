/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static Modele.Bulletin.genID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author margauxhery
 */
public class Bulletin {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdBulletin;
    private int IdTrimestre=0 ;
    private int IdInscription;
    public String Appreciation;
    
    //Constructeur 0
    public Bulletin(){
    IdBulletin = 0;
    IdTrimestre=0;
    IdInscription=0;
    Appreciation = null;
    }
    
    //Constructeur 1 
    public Bulletin(int IdBulletin,
                    int IdTrimestre,
                    int IdInscription,
                    String Appreciation){
        IdBulletin = genID.getAndIncrement();
        this.IdTrimestre=IdTrimestre;
        this.IdInscription=IdInscription;
        this.Appreciation = Appreciation;
        
    }
    
    
    //Getter
    public int getIdBulletin(){
        return IdBulletin;
    }
    public int getIdTrimestre(){
        return IdTrimestre;
    }
    public int getIdInscription(){
        return IdInscription;
    }
    public String getAppreciation(){
        return Appreciation;
    }
    
    //Setters
    public void setBulletin(int newIdBulletin){
        IdBulletin = newIdBulletin;
    }
    public void setBulletinTrim(int newIdTrimestre){
        IdTrimestre= newIdTrimestre;
    }
    public void setBulletinInsc(int newIdInscription){
        IdInscription = newIdInscription;
    }
    public void setBulletin(String newAppreciation){
        Appreciation = newAppreciation;
    }
    
}
