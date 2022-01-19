public class Client {

    private String nomClient;
    
    public Compte [] comptes=new Compte[100];
    int nbComptes = 0; //nombre de compte du client 


    public Client(String nom_du_client) {
        //crée un client avec le nom  
        ajouterCompte();
          this.nomClient=nom_du_client;
      }

    void afficherSolde(){
        System.out.println("Le solde est de :"+getSolde());

    }
    public String getNomClient() {
        return nomClient;
    }
    
    public float getSolde(){
        float total = 0;
        for (Compte element:comptes){

            total += element.getSolde();

        }
        return total;
    }

    public Compte getCompte(){
        return comptes[0];

    }
    void ajouterCompte(){

        comptes[nbComptes++]=new Compte();
       
    }
        
    
}
