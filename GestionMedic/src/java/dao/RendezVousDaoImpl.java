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
public class RendezVousDaoImpl implements RendezVousDao{
    
    private DAOFactory daoFactory;

    public RendezVousDaoImpl(DAOFactory d) {
        daoFactory = d;
    }
    
    @Override
    public void createRendezVous(RendezVous rdv) throws DAOException{
        
    }
    
    @Override
    public RendezVous readRendezVous(int idRdv) throws DAOException{
        return null;
    }
    
    @Override
    public void updateRendezVous(int idRdv) throws DAOException{
        
    }
    
    @Override
    public void deleteRendezVous(int idRdv) throws DAOException{
        
    }
}
