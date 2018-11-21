package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.Player;

abstract public class Character implements Unit {

    int rank;
    private boolean dead = false;
    private boolean steal = false;
    Player player;

    public Character(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return rank;
    }

    public void steal(){
        this.steal = true;
    }

    public void kill(){
        this.dead = true;
    }

    public void reset(){
        this.dead = false;
        this.steal = false;
    }

    public boolean getStatus(){
        return this.dead;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void reveal() {

    }
}
