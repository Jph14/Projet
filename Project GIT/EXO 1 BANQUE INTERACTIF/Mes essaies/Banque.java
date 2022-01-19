import java.util.ArrayList;
import java.util.List;


class BanqueInteractive {

    List <Client> clientList = new ArrayList<>();

    void ajouterClient(String nom_du_client){
        Client nouveau_client=new Client(nom_du_client);
    };
    
    int numero_du_client(){
        return nouveau_client.getCompte;
    
    }

    
    void bilanClient(int numero_du_client){
        
    };






    void afficherBilan(){};
    void interaction(){
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une operation sur un client");
        System.out.println("3) Afficher un bilan général");
        //mettre un scanner
        int choix = 0; //resultat scanner
        switch(choix){
            
            case 1:
            System.out.println("Entrez le nom du client");
            //scanner
            //fonction ajout client
            break;
            case 2:
            System.out.println("Quel client");
            //scanner
            System.out.println("Quelle operation vous-les vous effectuer sur le client");
            //nom client recup avant);
            System.out.println("Afficher un bilan");
            System.out.println("Afficher un retrait");
            System.out.println("Afficher un dépot");
            System.out.println("Faire un virement");
            
            break;
            case 3:
    
            //afficher bien general donc tout
    
            break;
        }
    }
    }   
    
    