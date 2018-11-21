package shajarat.shahab.bot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import shajarat.shahab.bot.Citadels.game.gameController;

import java.util.ArrayList;

public class main extends ListenerAdapter {

    gameController game = new gameController();

    public static void main(String[] args) throws Exception {
        JDABuilder builder = new JDABuilder(AccountType.BOT)
                .setToken("NTE0MTI2NTUxMzgyNjIyMjEx.DtSBTw.dhjQDHBoGJGvmFmp1KukoGzTaLw")
                .addEventListener(new main());
        builder.build();

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!ping"))
            event.getChannel().sendMessage(new MessageBuilder().append("pong").build()).queue();

        if (event.getMessage().getContentRaw().startsWith("!c "))
            game.respond(event);


    }

}
