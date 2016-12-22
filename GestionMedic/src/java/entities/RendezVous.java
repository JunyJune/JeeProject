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
public class RendezVous implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int IdRendezVous;
    
    @Column (name = "Date")
    private Date date;
    
    @Column (name = "ID_Medecin")
    private int idMedecin;
    
    @Column (name = "ID_Patient")
    private int idPatient;
    
    @Column (name = "ID_Creneaux")
    private int idCreneaux;
    
    RendezVous(Date d, int idM, int idP, int idC){
        date = d;
        idMedecin = idM;
        idPatient = idP;
        idCreneaux = idC;
    }
    
    void modifierRdv(Date d, int idM, int idP, int idC){
        date = d;
        idMedecin = idM;
        idPatient = idP;
        idCreneaux = idC;
    }
    
    public void setDate(Date d) { date = d; }
    public Date getDate() { return date; }
}
