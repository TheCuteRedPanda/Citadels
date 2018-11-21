package shajarat.shahab.bot.Citadels.game.Characters;

import shajarat.shahab.bot.Citadels.game.Player;

public interface Unit {
    int getRank();

    Player getPlayer();

    String getName();

    void reveal();

}
