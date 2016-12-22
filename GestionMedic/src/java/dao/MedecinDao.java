/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Medecin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aude
 */
@Stateless
public interface MedecinDao {
    
//    @PersistenceContext(unitName = "GestionMedicPU")
//            private EntityManager entityManager;
    
    void createMedecin(Medecin medecin) throws DAOException;
    
    Medecin readMedecin(int idMedecin) throws DAOException;
    
    void updateMedecin(int idMedecin) throws DAOException;
    
    void deleteMedecin(int idMedecin) throws DAOException;
    
}
