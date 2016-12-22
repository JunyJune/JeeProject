/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Medecin;

/**
 *
 * @author aude
 */
public interface MedecinDao {
    
    void createMedecin(Medecin medecin) throws DAOException;
    
    Medecin readMedecin(int idMedecin) throws DAOException;
    
    void updateMedecin(int idMedecin) throws DAOException;
    
    void deleteMedecin(int idMedecin) throws DAOException;
    
}
