package TP._1;

import java.util.ArrayList;
import java.util.List;

public class Secteur
{
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur = new ArrayList<Animal>();

    public Secteur(TypeAnimal typeAnimal)
    {
        this.typeAnimauxDansSecteur = typeAnimal;
    }
    public void ajouterAnimal(Animal animal)
    {
        animauxDansSecteur.add(animal);
        typeAnimauxDansSecteur = animal.getTypeAnimal();
    }

    public int getNombreAnimaux()
    {
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType()
    {
        return typeAnimauxDansSecteur;
    }
}
