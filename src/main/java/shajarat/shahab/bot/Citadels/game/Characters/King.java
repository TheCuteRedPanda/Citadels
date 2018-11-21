package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.CitadelsGame;
import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

import java.util.ArrayList;

public class King extends Character {
    private String name = "King";
    private boolean ability1 = false;

    public King() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility2(ArrayList<Player> players) {
        for (Player player : players)
            if (player.isKing())
                player.removeKing();
        this.player.setKing();

        return true;
    }

    public boolean activateAbility1() {
        if (!ability1)
            for (DistrictCard card : this.player.getCity().getDistricts())
                if (card.getDistrict().equals(District.YELLOW))
                    this.player.addGold(1);
        ability1 = true;
        return true;

    }

    @Override
    public void reveal() {
        activateAbility2(CitadelsGame.getPlayers());
    }
}
