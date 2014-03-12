/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.p10.mi.classe;

/**
 *
 * @author Neo
 */
public class Entreprise 
{
    private int id_entreprise;
    private String nom_entreprise;
    private String adresse_entreprise;

    public Entreprise(int id_entreprise, String nom_entreprise, String adresse_entreprise) {
        this.id_entreprise = id_entreprise;
        this.nom_entreprise = nom_entreprise;
        this.adresse_entreprise = adresse_entreprise;
    }
        
    /**
     * @return the id_entreprise
     */
    public int getId_entreprise() {
        return id_entreprise;
    }

    /**
     * @param id_entreprise the id_entreprise to set
     */
    public void setId_entreprise(int id_entreprise) {
        this.id_entreprise = id_entreprise;
    }
    
    /**
     * @return the nom_entreprise
     */
    public String getNom_entreprise() {
        return nom_entreprise;
    }

    /**
     * @param nom_entreprise the nom_entreprise to set
     */
    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    /**
     * @return the adresse_entreprise
     */
    public String getAdresse_entreprise() {
        return adresse_entreprise;
    }

    /**
     * @param adresse_entreprise the adresse_entreprise to set
     */
    public void setAdresse_entreprise(String adresse_entreprise) {
        this.adresse_entreprise = adresse_entreprise;
    }
        
}
