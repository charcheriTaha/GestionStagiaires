/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_stagiaires;

/**
 *
 * @author charc
 */
public class DetailAdminAModifier {

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTéléphone() {
        return téléphone;
    }

    public void setTéléphone(int téléphone) {
        this.téléphone = téléphone;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    private String nom;private String prénom;private int cin;private String matricule;private String mail ;private int téléphone;private String motdepasse;

    public DetailAdminAModifier() {
    }

    public DetailAdminAModifier(String nom, String prénom, int cin, String matricule, String mail, int téléphone, String motdepasse) {
        this.nom = nom;
        this.prénom = prénom;
        this.cin = cin;
        this.matricule = matricule;
        this.mail = mail;
        this.téléphone = téléphone;
        this.motdepasse = motdepasse;
    }
  
     

}
