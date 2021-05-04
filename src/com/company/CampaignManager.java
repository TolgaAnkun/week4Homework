package com.company;

public class CampaignManager implements CampaignService{

    Gamer _gamer;
    Game game;


    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanya eklenmiştir.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanya güncellenmiştir.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanya silinmiştir.");
    }

    @Override
    public void sell(Campaign campaign, Game game, Gamer _gamer) {
        System.out.println(campaign.getCampaignName() +" "+ " adlı kampanyadan yararlanarak" + " "+ campaign.getDiscount() + " "
        + " indirimle " + " " + _gamer.getNickName() + " adlı kullanıcı " + game.getName() + " adlı oyunu "
                + campaign.getPriceAfterDiscount(game) + "TL ye satın alınmıştır.");

    }
}
