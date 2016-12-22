/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.RendezVous;

/**
 *
 * @author aude
 */
public interface RendezVousDao {
    
    void createRendezVous(RendezVous rdv) throws DAOException;
    
    RendezVous readRendezVous(int idRdv) throws DAOException;
    
    void updateRendezVous(int idRdv) throws DAOException;
    
    void deleteRendezVous(int idRdv) throws DAOException;
}
