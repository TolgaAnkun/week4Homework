package com.company;

public interface CampaignService {
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
    void sell(Campaign campaign, Game game, Gamer _gamer);

}
