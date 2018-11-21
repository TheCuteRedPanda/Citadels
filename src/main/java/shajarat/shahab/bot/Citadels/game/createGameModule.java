package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class createGameModule implements moduleInterface {
    public boolean respond(MessageReceivedEvent event, String command) {
        MessageBuilder response = new MessageBuilder();
        if (command.toLowerCase().equals("creategame")) {
            if (!gameController.active) {
                gameController.active = true;
                response.append("Game has been created! Use '!c signup' to enter the game!");


            } else if (gameController.active)
                response.append("A game is already in progress!");

            event.getChannel().sendMessage(response.build()).queue();
            response.clear();
            return true;
        }
        return false;
    }
}

