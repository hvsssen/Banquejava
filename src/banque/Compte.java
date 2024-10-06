package banque ;
public abstract class Compte {
    protected double solde;
    protected int numero;
    protected Personne titulaire;
    
    
    //Creation dun compte avec solde 
    protected Compte(double solde, int numero, Personne titulaire) {
  
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde=solde;
    }
    
    
    protected Compte(int numero, Personne titulaire) {
        this(0, numero, titulaire);
    }

    protected double getSolde() {
        return solde;
    }
    protected double setSolde(double solde) {
        return this.solde=solde;
    }

    public int getNumero() {
        return numero;
    }

    public Personne getTitulaire(){
        return this.titulaire ;}
    
    
    public Personne setTitulaire(Personne Titulaire) {
        return this.titulaire=Titulaire;
    }

    protected abstract void deposerArgent(double montant);

    protected abstract void retirerArgent(double montant);

    public void afficherCompte() {
        System.out.println("Numéro de compte : " + numero);
        System.out.println("Solde : " + solde);
        System.out.println("Titulaire : " + titulaire.getNom() + " " + titulaire.getPrenom() + "\n");
    }
}





