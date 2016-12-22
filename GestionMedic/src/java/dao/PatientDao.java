/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Patient;

/**
 *
 * @author aude
 */
public interface PatientDao {
    
    void createPatient(Patient patient) throws DAOException;
    
    Patient readPatient(int idPatient) throws DAOException;
    
    void updatePatient(int idPatient) throws DAOException;
    
    void deletePatient(int idPatient) throws DAOException;
}
