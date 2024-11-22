package org.amedee.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compte
{
    private int numCompte;
    private int solde;
    private Client client;

    public Compte(int numCompte, int solde, Client client)
    {
        this.numCompte = numCompte;
        this.solde = solde;
        this.client = client;
    }
    public static void main(String[] args)
    {
        List<Compte> listCompte = new ArrayList<Compte>(10);

        for (int i = 0; i < 10; i++)
        {
            listCompte.add(new Compte(i, i * i,
                    new Client(Integer.toString('A' + i), Integer.toString('Z' - i))));
        }


        for (int i = 0; i < 10; i++)
        {
            System.out.println(listCompte.get(i));
        }

    }
    @Override
    public String toString() {
        return "numCompte " + Integer.toString(numCompte) + " solde " + Integer.toString(solde) + Client.ToString();
    }
}
