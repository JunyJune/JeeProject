/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Creneaux;

/**
 *
 * @author aude
 */
public interface CreneauxDao {
    
    void createCreneaux(Creneaux creneaux) throws DAOException;
    
    Creneaux readCreneaux(int idCreneaux) throws DAOException;
    
    void updateCreneaux(int idCreneaux) throws DAOException;
    
    void deleteCreneaux(int idCreneaux) throws DAOException;
}
