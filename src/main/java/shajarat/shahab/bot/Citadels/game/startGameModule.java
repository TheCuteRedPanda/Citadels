package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class startGameModule implements moduleInterface {
    @Override
    public boolean respond(MessageReceivedEvent event, String command) {
        MessageBuilder response = new MessageBuilder();
        if (command.toLowerCase().equals("startgame")) {
            if (!gameController.active) {
                response.append("No game currently in progress!");
            } else if (gameController.active) {
                CitadelsGame game = new CitadelsGame(gameController.getParticipants());
                game.startGame(gameController.getParticipants(), event);

            }
            return true;
        }
        return false;

    }
}
