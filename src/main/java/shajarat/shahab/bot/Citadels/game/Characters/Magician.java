package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.CitadelsGame;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

import java.util.ArrayList;
import java.util.List;

public class Magician extends Character {
    private String name = "Magician";
    private boolean ability1 = false;

    public Magician() {
        super(3);
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean activateAbility1(Player target) {
        if (!(this.getPlayer().equals(target)) && !ability1) {
            ArrayList<DistrictCard> temp = this.getPlayer().getHand();
            this.getPlayer().setHand(target.getHand());
            target.setHand(temp);
            ability1 = true;
            return true;
        }
        return false;
    }

    public boolean activateAbility2(List<DistrictCard> discards) {
        if (!ability1){
            for (DistrictCard card : discards)
                CitadelsGame.discardCard(card);
            for (DistrictCard card : discards)
                this.player.drawCard();
            ability1 = true;
            return true;
        }
        return false;
    }
}
