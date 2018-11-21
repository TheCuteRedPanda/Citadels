package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.CitadelsGame;
import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

import java.util.ArrayList;

public class Bishop extends Character {

    private String name = "Bishop";
    private boolean ability1 = false;

    public Bishop() {
        super(5);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility2() {
        this.player.getCity().protect(true);
        return true;
    }

    public boolean activateAbility1() {
        if (!ability1)
            for (DistrictCard card : this.player.getCity().getDistricts())
                if (card.getDistrict().equals(District.BLUE))
                    this.player.addGold(1);
        ability1 = true;
        return true;

    }

    @Override
    public void reveal() {
        activateAbility2();
    }
}
