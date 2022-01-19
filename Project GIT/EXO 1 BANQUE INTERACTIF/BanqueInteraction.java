package com.training.example;

import java.util.Scanner;

public class BanqueInteraction {

    private Scanner scanner;
    private Banque banque;

    public BanqueInteraction() {
        this.scanner = new Scanner(System.in);
        this.banque = new Banque("CIC");
    }

    public void interaction() {
        System.out.println("### MINI-BANQUE INTERACTIVE ###");
        System.out.println("Quelle opération voulez-vous effectuer ?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une operation sur un client");
        System.out.println("3) Afficher un bilan général");
        System.out.println("4) Quitter");
        int choice = this.scanner.nextInt();

        switch (choice) {
            case 1:
                interactionAjoutClient();
                break;
            case 2:
                interactionOperationClient();
                break;
            case 3:
                interactionAfficherBilan();
                break;
            case 4:
                interactionStop();
                break;
            default:
                System.out.println("Votre choix n'existe pas. Veuillez recommencer");
                interaction();
        }
    }

    private void interactionStop() {
        this.scanner.close();
        System.out.println("Merci et à bientôt");
        System.exit(0);
    }

    private void interactionAfficherBilan() {
    }

    private void interactionOperationClient() {
//        Client client = this.banque.getClientParNom(nomDuClient);
    }

    private void interactionAjoutClient() {
        System.out.println("Entrez le nom du client :");
        String nomDuClient = this.scanner.next();
        this.banque.ajouterClient(nomDuClient);
        System.out.println("Le client " + nomDuClient + " a été créé");
        interaction();
    }
}
