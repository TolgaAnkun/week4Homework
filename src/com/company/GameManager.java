package com.company;

public class GameManager implements GameServices {

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " adlı oyun eklenmiştir.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " adlı oyun güncellenmiştir..");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " adlı oyun silinmiştir.");
    }
}
