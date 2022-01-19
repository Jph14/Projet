
public class Main {

    public static void main(String[] args) {
        System.out.println("Bonjour Java :) ");
        Client nouveau_client=new Client("Alexandre");  
    }
}

class Compte {

    private int numero; 
    public int getNumero(){
        return numero;

    }
    private float solde; 

    public void depot(float montant){
        this.solde=(solde+montant);
    };

    public void retrait(float montant){
        this.solde=(solde-montant);
    }; 
    public float getSolde(){
        return solde;
    }
    public void setSolde(float solde){
        this.solde=solde;

    }

    public void afficherSolde(){
        System.out.println("Le solde est de :"+solde);
    };

    void virer(float valeur, Compte destinataire){
        this.solde=(solde-valeur);
        
        destinataire.setSolde(solde+valeur);
    }


}




