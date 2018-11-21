package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

public class Merchant extends Character {
    private String name = "Merchant";
    private boolean ability1 = false;
    private boolean ability2 = false;

    public Merchant() {
        super(6);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility2() {
        if (!ability2){
            this.player.addGold(1);
            ability2 = true;
            return true;
        }

        return false;
    }

    public boolean activateAbility1() {
        if (!ability1)
            for (DistrictCard card : this.player.getCity().getDistricts())
                if (card.getDistrict().equals(District.GREEN))
                    this.player.addGold(1);
        ability1 = true;
        return true;

    }
}
