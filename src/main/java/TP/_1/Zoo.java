package TP._1;

import java.util.List;

public class Zoo
{
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParsecteur;

    public void ajouterSecteur(TypeAnimal typeAnimal)
    {
        secteursAnimaux.add(new Secteur(typeAnimal));
    }

    public void nouveauVisiteur()
    {
        setVisiteurs(getVisiteurs() + 1);
    }

    public int getLimitVisiteur()
    {
        return nbVisiteurMaxParsecteur;
    }

    public void nouvelAnimal(Animal animal)
    {
        secteursAnimaux.add(animal);
    }

    public int nombreAnimaux()
    {
        int nbre = 0;

        for (int i = 0; i < secteursAnimaux.size(); i++)
        {
            nbre += secteursAnimaux.get(i).getNombreAnimaux();
        }

        return nbre;
    }

    public void setVisiteurs(int visiteurs) {
        this.visiteurs = visiteurs;
    }

    public int getVisiteurs() {
        return visiteurs;
    }
}
