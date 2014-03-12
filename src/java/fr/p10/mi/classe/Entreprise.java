/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.p10.mi.classe;

import java.util.ArrayList;

/**
 *
 * @author Neo
 */
public class Entreprise 
{
    private int idEntreprise;
    private String nomEntreprise;
    private String adresseEntreprise;
    private ArrayList<Stage> mesStages;

    public Entreprise(int idEntreprise, String nomEntreprise, String adresseEntreprise, ArrayList<Stage> mesStages) {
        this.idEntreprise = idEntreprise;
        this.nomEntreprise = nomEntreprise;
        this.adresseEntreprise = adresseEntreprise;
        this.mesStages = mesStages;
    }

    /**
     * @return the idEntreprise
     */
    public int getIdEntreprise() {
        return idEntreprise;
    }

    /**
     * @param idEntreprise the idEntreprise to set
     */
    public void setIdEntreprise(int idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    /**
     * @return the nomEntreprise
     */
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    /**
     * @param nomEntreprise the nomEntreprise to set
     */
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    /**
     * @return the adresseEntreprise
     */
    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    /**
     * @param adresseEntreprise the adresseEntreprise to set
     */
    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    /**
     * @return the mesStages
     */
    public ArrayList<Stage> getMesStages() {
        return mesStages;
    }

    /**
     * @param mesStages the mesStages to set
     */
    public void setMesStages(ArrayList<Stage> mesStages) {
        this.mesStages = mesStages;
    }
    
}
