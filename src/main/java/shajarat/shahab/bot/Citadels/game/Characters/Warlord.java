package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.CitadelsGame;
import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

public class Warlord extends Character {

    private String name = "Warlord";
    private boolean ability1 = false;
    private boolean ability2 = false;

    public Warlord() {
        super(8);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility2(Player playerTarget, DistrictCard cardTarget) {
        if (!(ability2 && (playerTarget.equals(this.player)) && playerTarget.getCity().isProtected())){
            for (DistrictCard card : playerTarget.getCity().getDistricts())
                if (card.equals(cardTarget)) {
                    playerTarget.getCity().destroy(cardTarget);
                    ability2 = true;
                    return ability2;
                }

        }
        return ability2;
    }

    public boolean activateAbility1() {
        if (!ability1 && !this.player.getCity().isProtected()) {
            for (DistrictCard card : this.player.getCity().getDistricts())
                if (card.getDistrict().equals(District.RED))
                    this.player.addGold(1);
            ability1 = true;
            return ability1;
        }
        return ability1;
    }
}
