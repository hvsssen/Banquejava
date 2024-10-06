package banque;

public class CompteEpargne extends Compte {
    public CompteEpargne(double solde, int numero, Personne titulaire) {
        super(solde, numero, titulaire);
    }

    public void retirerArgent(double montant) {
        if (montant <= this.getSolde()) {
            this.setSolde(this.getSolde()-montant);
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void deposerArgent(double montant) {
    	this.setSolde(this.getSolde()+montant);
    }


}