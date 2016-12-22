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
public class MedecinDaoImpl implements MedecinDao{
    
    private DAOFactory daoFactory;

    public MedecinDaoImpl(DAOFactory d) {
        daoFactory = d;
    }
        
    @Override
    public void createMedecin(Medecin medecin) throws DAOException{
        
    }
    
    @Override
    public Medecin readMedecin(int idMedecin) throws DAOException{
        return null;
    }
    
    @Override
    public void updateMedecin(int idMedecin) throws DAOException{
        
    }
    
    @Override
    public void deleteMedecin(int idMedecin) throws DAOException{
        
    }
}
