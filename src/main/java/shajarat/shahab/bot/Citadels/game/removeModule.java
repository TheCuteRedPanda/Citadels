package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class removeModule implements moduleInterface {
    @Override
    public boolean respond(MessageReceivedEvent event, String command) {
        MessageBuilder response = new MessageBuilder();
        if (command.toLowerCase().equals("remove")) {
            if (!gameController.active) {
                response.append("No game currently in progress!");
            } else if (gameController.active) {
                gameController.participants.remove(event.getAuthor().getId());
                response.append("User ").append(event.getAuthor()).append(" has been removed from the game!");
            }
            event.getChannel().sendMessage(response.build()).queue();
            response.clear();
            return true;
        }
        return false;
    }
}
