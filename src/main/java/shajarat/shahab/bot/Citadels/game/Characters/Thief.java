package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.Player;

public class Thief extends Character {
    private String name = "Thief";
    private boolean ability1 = false;

    public Thief(){
        super(2);
    }

    @Override
    public String getName(){
        return name;
    }

    public boolean activateAbility1(Character target){
        if (!(target.getName().equals("Thief")) || !(target.getName().equals("Assassin")) && !ability1 ) {
            target.steal();
            ability1 = true;
            return true;
        }
        return false;
    }
}
