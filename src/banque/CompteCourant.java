package banque;

import java.util.ArrayList;
import java.util.List;

public class CompteCourant extends Compte {
    private  List<Double> transactions = new ArrayList<>();
  

    public CompteCourant(double solde, int numero, Personne titulaire) {
        super(solde, numero, titulaire);
    }

    public void retirerArgent(double montant) {
        if (montant + 1 <= this.getSolde()) {
            this.setSolde (this.getSolde()- (montant + 1));
            transactions.add( -montant);
           
        } 
        else {
            System.out.println("Solde insuffisant");
        }
    }

    public void deposerArgent(double montant) {
    	this.setSolde (this.getSolde()+ (montant));
    	transactions.add( +montant);
    
    }

    public void afficherTransactions() {
        System.out.print("Table de transactions : ");
        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.print(transactions.get(i)+ " / ");
        }
        System.out.println();
    }

}

