package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;
import shajarat.shahab.bot.Citadels.game.Player;

public class TaxCollector extends Character {
    private String name = "Tax Collector";
    private boolean ability1 = false;
    private int tax = 0;

    public TaxCollector() {
        super(9);
    }

    @Override
    public String getName() {
        return name;
    }


    public boolean activateAbility1() {
        if (!ability1) {
            this.player.addGold(this.tax);
            resetTax();
            ability1 = true;
            return ability1;
        }
        return ability1;
    }

    public void addTax(Player player) {
        if (player.getGold() > 0) {
            player.addGold(-1);
            this.tax++;
        }
    }

    public void resetTax(){
        this.tax = 0;
    }

}
