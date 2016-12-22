/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author aude
 */
public class DAOFactory {
    
    private static final String PROPERTIES_FILE   = "GestionMedic/web/WEB_INF/dao.properties";
    private static final String PROPERTY_URL      = "url";
    private static final String PROPERTY_DRIVER   = "driver";
    private static final String PROPERTY_LOGIN    = "login";
    private static final String PROPERTY_PASSWORD = "password";
    
    private String url;
    private String login;
    private String password;

    /**
     * Constructeur
     * @param u : url
     * @param l : login
     * @param p : password
     */
    DAOFactory(String u, String l, String p) {
        url = u;
        login = l;
        password = p;
    }
    
    /**
     * Récupère les informations de connexion à la bdd
     * @return : l'instance de la Factory
     * @throws DAOConfigurationException 
     */
    public static DAOFactory getInstance() throws DAOConfigurationException{
        Properties properties = new Properties();
        String url;
        String driver;
        String login;
        String password;
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesFile = classLoader.getResourceAsStream(PROPERTIES_FILE);
        
        //Si problème avec le fichier de propriétés
        if (propertiesFile == null){
            throw new DAOConfigurationException("Le fichier des propriétés " + PROPERTIES_FILE + " n'a pas pu être ouvert");
        }
        
        //Récupération des informations du fichier de propriétés
        try{
            properties.load(propertiesFile);
            url = properties.getProperty(PROPERTY_URL);
            driver = properties.getProperty(PROPERTY_DRIVER);
            login = properties.getProperty(PROPERTY_LOGIN);
            password = properties.getProperty(PROPERTY_PASSWORD);
        }
        catch (IOException e){
            throw new DAOConfigurationException("Impossible de lire le fichier des propiétés " + PROPERTIES_FILE, e);
        }
        
        //Vérification de l'existance du driver pour la base de données choisie
        try{
            Class.forName(driver);
        }
        catch (ClassNotFoundException e){
            throw new DAOConfigurationException("Le driver de la bdd est introuvable dans le classpath", e);
        }
        
        //Récupération de l'instance
        DAOFactory instance = new DAOFactory(url, login, password);
        return instance;
    }
    
    //Connexion à la bdd
    Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, login, password);
    }
    
    //Récupération de l'implémentation du DAO Médecin
    public MedecinDao getMedecinDao(){
        return new MedecinDaoImpl();
    }
}
