/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author aude
 */
public class Patient {
    private String nom;
    private String prenom;
    
    public void setNom(String n) { nom = n; }
    public String getNom() { return nom; }
    public void setPrenom(String p) { prenom = p; }
    public String getPrenom() { return prenom; }
}
