package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class shutDownModule implements moduleInterface {
    @Override
    public boolean respond(MessageReceivedEvent event, String command) {
        MessageBuilder response = new MessageBuilder();
        return false;

    }
}
