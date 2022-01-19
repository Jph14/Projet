class Compte {

    private int numero; 
    private float solde; 


    void virer(float valeur, Compte destinataire){
        this.retrait(valeur);
        destinataire.depot(valeur);
    }
    public void afficherSolde(){
        System.out.println("Le solde est de :"+solde);
    }

    public void depot(float montant){
        this.solde=(solde+montant);
    }

    public void retrait(float montant){
        this.solde=(solde-montant);
    }
    public float getSolde(){
        return solde;
    }
    public void setSolde(float solde){
        this.solde=solde;

    }
    public int getNumero(){
        return numero;
    }
    


}

