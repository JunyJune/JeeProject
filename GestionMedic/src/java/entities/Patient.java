/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aude
 */
@Entity
public class Patient implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idPatient;
    
    @Column (name = "Nom")
    private String nom;
    
    @Column (name = "Prenom")
    private String prenom;
    
    Patient(String n, String p){
        //IdPatient = nouvel ID généré par la base ?
        nom = n;
        prenom = p;
    }
    
    public void setNom(String n){
        nom = n;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setPrenom(String p){
        prenom = p;
    }
    
    public String getPrenom(){
        return prenom;
    }
}
