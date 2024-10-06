package banque;

import java.util.ArrayList;
import java.util.List;
public class Banque {
    private String nom ;
    private List<Compte> comptes = new ArrayList<>();
   

    public Banque(String nom) {
        this.nom = nom;
    }

    public Compte rechercherCompte(int numero) {
        for (int i = 0; i < this.comptes.size(); i++) {
            if (this.comptes.get(i).getNumero() == numero) {
                return this.comptes.get(i);
            }
        }
        return null;
    }
    
    public void ouvrirCompte(Compte compte) {
        this.comptes.add (compte);
    }

  
    public void fermerCompte(int numero) {
        for (int i = 0; i < this.comptes.size(); i++) {
            if (this.comptes.get(i).getNumero() == numero) {
                this.comptes.remove(i);
                break;
            }

        }

    }

    public void afficherBanque() {
        System.out.println("Nom de la banque : " + nom);
        System.out.println("Liste des comptes : \n");
        for (int i = 0; i < this.comptes.size(); i++) {
            this.comptes.get(i).afficherCompte();
        }
    }
}
