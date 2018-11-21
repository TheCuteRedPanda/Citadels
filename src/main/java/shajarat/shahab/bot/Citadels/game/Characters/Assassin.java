package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.Player;

public class Assassin extends Character {
    private String name = "Assassin";
    private boolean ability1 = false;

    public Assassin(){
        super(1);
    }

    @Override
    public String getName(){
        return name;
    }

    public boolean activateAbility1(Character target){
        if (!(target.getName().equals("Assassin")) && !ability1 ) {
            target.kill();
            ability1 = true;
            return true;
        }
        return false;
    }
}
