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
public class Evaluation {
     //Attributs
    public static AtomicInteger genID = new AtomicInteger();
    protected int IdEvaluation;
    private int IdDetailsBulletin;
    private String appreciation;
    public float note;
    
    //Constructeur 0
    public Evaluation(){
        IdEvaluation = 0;
        IdDetailsBulletin=0;
        appreciation = null;
        note = 0.0f;
    }
    
    //Constructeur 1 
    public Evaluation(int IdEvaluation, int IdDetailsBulletin, String appreciation, float note){
        IdEvaluation = genID.getAndIncrement();
        this.IdDetailsBulletin=IdDetailsBulletin;
        appreciation = null;
        note = 0.0f;
    }
    
    //Getters
    public int getIdEvaluationn(){
        return IdEvaluation;
    }
    public int getIdDetailsBulletin(){
        return IdDetailsBulletin;
    }
    public String getappreciation(){
        return appreciation;
    }
    public float getnote(){
        return note;
    }
    
    
    //Setters
    public void setEvaluation(int newIdEvaluation){
        IdEvaluation = newIdEvaluation;
    }
    public void setEvaluationDetBul(int newIdDetailsBulletin){
        IdDetailsBulletin=newIdDetailsBulletin;
    }
    public void setEvaluation(String newappreciation){
        appreciation = newappreciation;
    }
    public void setEvaluation(float newnote){
        note = newnote;
    }
    
}
