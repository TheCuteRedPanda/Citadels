package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import shajarat.shahab.bot.Citadels.game.Characters.*;
import shajarat.shahab.bot.Citadels.game.Characters.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CitadelsGame {

    private ArrayList<Player> players;
    private LinkedList<DistrictCard> deck = new LinkedList<>();
    private ArrayList<Character> characters = new ArrayList<>();
    static public MessageChannel citadelsChannel;

    public boolean discardCard(DistrictCard card) {
        deck.addLast(card);
        return true;
    }

    public DistrictCard drawCard() {
        return deck.pollFirst();
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    private LinkedList<DistrictCard> defaultDeck() {
        LinkedList<DistrictCard> deck = new LinkedList<DistrictCard>();
        for (int i = 0; i < 54; i++)
            deck.add(new DistrictCard(District.RED, 1, "Watchtower"));
        return deck;
    }

    private ArrayList<Character> defaultCharacters() {
        ArrayList<Character> defaultCharacters = new ArrayList<>();
        defaultCharacters.add(new Assassin());
        defaultCharacters.add(new Thief());
        defaultCharacters.add(new Magician());
        defaultCharacters.add(new King());
        defaultCharacters.add(new Bishop());
        defaultCharacters.add(new Merchant());
        defaultCharacters.add(new Architect());
        defaultCharacters.add(new Warlord());
        if (this.players.size() == 3 || this.players.size() == 8)
            defaultCharacters.add(new TaxCollector());
        return defaultCharacters;
    }

    public void startGame(ArrayList<Player> participants, MessageReceivedEvent event) {
        citadelsChannel = event.getChannel();
        citadelsChannel.sendMessage(new MessageBuilder("Starting a game with the following players:\n").build()).queue();
        for (Player player : participants)
            event.getChannel().sendMessage(new MessageBuilder().append(player.toString()).build()).queue();
        setPlayers(participants);

        for (int i = 0; i < this.players.size(); i++)
            this.players.get(i).setIndex(i);

        setCharacters(defaultCharacters());
        Collections.shuffle(characters);

        setDeck(defaultDeck());
        Collections.shuffle(deck);

        for (Player player : this.players)
            for (int i = 0; i < 4; i++)
                player.drawCard();

        selectKing(this.players);

        SelectionPhase.startSelection(new ArrayList<Player>(this.players), new ArrayList<Character>(this.characters));


    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setDeck(LinkedList<DistrictCard> deck) {
        this.deck = deck;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    private void selectKing(ArrayList<Player> players) {
        int number = Randomize.newInt(0,players.size());
        players.get(number).setKing();
    }

    public CitadelsGame(ArrayList<Player> players) {
        this.players = players;
    }
}
