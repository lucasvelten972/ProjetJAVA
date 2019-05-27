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
    private String appreciation;
    public float note;
    
    //Constructeur 0
    public Evaluation(){
        IdEvaluation = 0;
        appreciation = null;
        note = 0.0f;
    }
    
    //Constructeur 1 
    public Evaluation(int IdEvaluation){
        IdEvaluation = genID.getAndIncrement();
        appreciation = null;
        note = 0.0f;
    }
    
    //Getters
    public int getIdEvaluationn(){
        return IdEvaluation;
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
    public void setEvaluation(String newappreciation){
        appreciation = newappreciation;
    }
    public void setEvaluation(float newnote){
        note = newnote;
    }
    
}
