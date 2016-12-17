/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author aude
 */
public class Creneaux {
    private Date debut;
    private Date fin;
    
    public void setDebut(Date d) { debut = d; }
    public Date getDebut() { return debut; }
    public void setFin(Date d) { fin = d; }
    public Date getFin() { return fin; }
}
