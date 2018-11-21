package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class signUpModule implements moduleInterface {
    public boolean respond(MessageReceivedEvent event, String command) {
        if (command.toLowerCase().equals("signup")) {
            for (Player participant : gameController.getParticipants())
                if (participant.getID().equals(event.getAuthor().getId())) {
                    event.getChannel().sendMessage(new MessageBuilder().append("You are already signed up for this game!").build()).queue();
                    return true;
                }
            gameController.participants.add(new Player(event.getAuthor(), false, event.getAuthor().getId()));
            event.getChannel().sendMessage(new MessageBuilder().append("Signed ").append(event.getAuthor()).append(" up to the game!").build()).queue();
            return true;
        }
        return false;
    }
}
