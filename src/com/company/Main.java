package com.company;

public class Main {

    public static void main(String[] args) {


        CampaignManager campaignManager = new CampaignManager();
        Campaign campaign1 = new Campaign();
        Game game= new Game();
        Gamer gamer1 = new Gamer();
        GamerManager gamerManager = new GamerManager(new ValidatorManager());
        GameManager gameManager= new GameManager();



        // Oyun tanımlama
        game.setId(1);
        game.setName("Bleach");
        game.setPrice(100);
        game.setDetails("Göremediğimiz şeyden korkar ve göremedğiğimiz şeye saygı duyarız.");

        // oyuncu tanımlama
        gamer1.setNickName("CoyoteStarrk");
        gamer1.setFirstName("Tolga");
        gamer1.setLastName("ANKUN");
        gamer1.setDateOfBirth(1990);
        gamer1.setNationalIdentityNumber("10123456789");

        //kampanya tanımlama
        campaign1.setId(1);
        campaign1.setCampaignName("Yeni Başlangıca özel");
        campaign1.setDiscount(15);

        // kampanya ile ilgili işlemler
        campaignManager.add(campaign1);
        campaignManager.update(campaign1);
        campaignManager.delete(campaign1);
        campaignManager.sell(campaign1, game, gamer1);

        // oyuncu ile ilgili işlemler
        gamerManager.add(gamer1);
        gamerManager.update(gamer1);
        gamerManager.delete(gamer1);

        // oyun ile ilgili işlemler
        gameManager.add(game);
        gameManager.update(game);
        gameManager.delete(game);



    }

}
