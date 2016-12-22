/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author aude
 */
@Entity
public class Creneaux implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCreneaux;
    
    @Column (name = "Debut")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date debut;
    
    @Column (name = "Fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fin;
    
    @Column (name = "Libre")
    private boolean libre;
    
    @Column (name = "ID_Medecin")
    private int idMedecin;
    
    public void setIdCreaneaux(int i){
        idCreneaux = i;
    }
    
    public int getIdCreneaux(){
        return idCreneaux;
    }
    
    public void setIdMedecin(int i){
        idMedecin = i;
    }
    
    public int getIdMedecin(){
        return idMedecin;
    }
    
    public void setDebut(Date d){
        debut = d;
    }
    
    public Date getDebut(){
        return debut;
    }
    
    public void setFin(Date d){
        fin = d;
    }
    
    public Date getFin(){
        return fin;
    }
    
    public void setLibre(boolean l){
        libre = l;
    }
    
    public boolean getLibre(){
        return libre;
    }
}
