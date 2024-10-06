package banque ; 
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
         //Création d'une personne
         Personne personne1 = new Personne(14035333, "Slim", "Hassen", 21);
         Personne personne2 = new Personne(14035338, "xxx", "yy", 21);
         System.out.println("Affichage de la personne :");
         System.out.println("Nom :" + personne1.getNom() +" Prénom : " + personne1.getPrenom() +" CIN : " + personne1.getCin()+" Âge : " + personne1.getAge());
         System.out.println();
          
          //Création d'un compte
         CompteEpargne compteEpargne = new CompteEpargne(1000,personne1.getCin(), personne1);
         System.out.println("Affichage du compteEpargne :");
         compteEpargne.afficherCompte();
         
         CompteCourant compteCourant = new CompteCourant(2000, personne2.getCin(), personne2);
        
         // Création d'une banque
         Banque banque1 = new Banque("Biat");
         System.out.println("Affichage de la banque avant ouverture de compte :");
         banque1.afficherBanque();
         System.out.println();
        
         // Ouverture d'un compte dans la banque
         banque1.ouvrirCompte(compteCourant);
         banque1.ouvrirCompte(compteEpargne);
         System.out.println("Affichage de la banque après ouverture de compte :");
         banque1.afficherBanque();
         System.out.println();
         
         // Dépôt dans le compte
         System.out.println("Solde du compte avant dépôt : " + compteCourant.getSolde());
         compteCourant.deposerArgent(500);
         System.out.println("Solde du compte après dépôt  : " + compteCourant.getSolde());
         System.out.println();
         
         // Retrait du compte
         System.out.println("Solde du compte avant retrait : " + compteCourant.getSolde());
         compteCourant.retirerArgent(200);
         System.out.println("Solde du compte après retrait : " + compteCourant.getSolde());
         System.out.println();
         
         //Affichage des transaction dun compteCourant
         compteCourant.afficherTransactions();
         
         // Fermeture du compte dans la banque
         System.out.println("Affichage de la banque avant fermeture de compte :");
         banque1.afficherBanque();
         banque1.fermerCompte(personne2.getCin());
         System.out.println("Affichage de la banque après fermeture de compte :");
         banque1.afficherBanque();
          
    	 System.out.println("Solde du compte avant dépôt : " + compteEpargne.getSolde());
    	 compteEpargne.deposerArgent(500);
        
    	 compteEpargne.afficherCompte();
    	 

    }
}
