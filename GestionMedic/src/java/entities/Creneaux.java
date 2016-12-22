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
    private Date debut;
    
    @Column (name = "Fin")
    private Date fin;
    
    @Column (name = "Libre")
    private boolean libre;
    
    public void setDebut(Date d) { debut = d; }
    public Date getDebut() { return debut; }
    public void setFin(Date d) { fin = d; }
    public Date getFin() { return fin; }
    public void setLibre(boolean l) { libre = l; }
    public boolean getLibre() { return libre; }
}
