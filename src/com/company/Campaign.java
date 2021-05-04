package com.company;

public class Campaign {
    private int id;
    private String campaignName;
    private double discount;
    private double priceAfterDiscount;

    public Campaign() {
    }

    public Campaign(int id, String campaignName, double discount) {
        this.id = id;
        this.campaignName = campaignName;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceAfterDiscount(Game game) {
        priceAfterDiscount = game.getPrice() - (game.getPrice() * discount /100);
        return priceAfterDiscount;
    }
}
