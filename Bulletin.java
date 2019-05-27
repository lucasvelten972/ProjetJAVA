/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static Modele.Bulletin.genID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author margauxhery
 */
public class Bulletin extends Trimestre {
    //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdBulletin;
    private HashMap<Integer, Trimestre> TrimMap;
    private HashMap<Integer, Inscription> InscrMap;
    public String Appreciation;
    
    //Constructeur 0
    public Bulletin(){
    super();
    IdBulletin = 0;
    TrimMap = new HashMap<Integer, Trimestre> ();
    InscrMap = new HashMap<Integer, Inscription>();
    Appreciation = null;
    }
    
    //Constructeur 1 
    public Bulletin(int IdBulletin, 
                    HashMap<Integer, Trimestre> newTrimMap,
                    HashMap<Integer, Inscription> newInscrMap,
                    String Appreciation){
        IdBulletin = genID.getAndIncrement();
        TrimMap = new HashMap<>();
        TrimMap.putAll(newTrimMap);
        InscrMap = new HashMap<>();
        InscrMap.putAll(newInscrMap);
        this.Appreciation = Appreciation;
        
    }
    
    
    //Getter
    public int getIdBulletin(){
        return IdBulletin;
    }
    public String getAppreciation(){
        return Appreciation;
    }
    
    //Setters
    public void setBulletin(int newIdBulletin){
        IdBulletin = newIdBulletin;
    }
    public void SetBulletin(String newAppreciation){
        Appreciation = newAppreciation;
    }
    
}
