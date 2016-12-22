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
public class CreneauxDaoImpl implements CreneauxDao{
    
    private DAOFactory daoFactory;

    public CreneauxDaoImpl(DAOFactory d) {
        daoFactory = d;
    }
    
    @Override
    public void createCreneaux(Creneaux creneaux) throws DAOException{
        
    }
    
    @Override
    public Creneaux readCreneaux(int idCreneaux) throws DAOException{
        return null;
    }
    
    @Override
    public 
    
    void updateCreneaux(int idCreneaux) throws DAOException{
        
    }
    
    @Override
    public 
    
    void deleteCreneaux(int idCreneaux) throws DAOException{
        
    }
}
