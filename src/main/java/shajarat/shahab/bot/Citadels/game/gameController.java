package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.List;

public class gameController {

    private List<moduleInterface> modules = new ArrayList<>();
    private createGameModule createGame = new createGameModule();
    static boolean active = false;
    static ArrayList<Player> participants = new ArrayList<>();


    public boolean respond(MessageReceivedEvent event) {
        String command = event.getMessage().getContentRaw().substring(3);
        if (command.toLowerCase().equals("creategame")) {
            createGame.respond(event, command);
            return true;
        }
        else if (!active) {
            event.getChannel().sendMessage(new MessageBuilder().append("No game currently in progress!").build()).queue();
            return true;
        }
        else
            for (moduleInterface module : modules)
                if (module.respond(event, command))
                    return true;

        event.getChannel().sendMessage(new MessageBuilder().append("Unknown Command").build()).queue();
        return false;
    }

    public gameController() {
        this.modules.add(new signUpModule());
        this.modules.add(new removeModule());
        this.modules.add(new startGameModule());
        this.modules.add(new infoModule());
        //modules.add(new shutDownModule());
    }

    public static ArrayList<Player> getParticipants() {
        return participants;
    }
}

