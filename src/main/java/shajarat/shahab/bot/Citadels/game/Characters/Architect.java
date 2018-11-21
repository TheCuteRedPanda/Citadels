package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.CitadelsGame;
import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

public class Architect extends Character {
    private String name = "Architect";
    private boolean ability1 = false;

    public Architect() {
        super(7);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility2() {
        this.player.setBuilds(3);
        return true;
    }

    public boolean activateAbility1() {
        if (!ability1) {
            for (int i = 0; i < 2; i++)
                this.player.drawCard();
            ability1 = true;
            return ability1;
        }

        return ability1;
    }

    @Override
    public void reveal() {
        activateAbility2();
    }
}
