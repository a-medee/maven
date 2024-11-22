package org.amedee.model;

public class Client
{
    public static String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private static String nom;
    private static String prenom;

    public Client(String nom, String prenom)
    {
        setNom(nom);
        setPrenom(prenom);
    }

    public static String ToString() {
        return " Nom: " + getNom() + " Prenom: " + getPrenom();
    }
}
