package shajarat.shahab.bot.Citadels.game.Builders;

import shajarat.shahab.bot.Citadels.game.District;
import shajarat.shahab.bot.Citadels.game.DistrictCard;

import java.util.LinkedList;

public class DeckBuilder {
    private final LinkedList<DistrictCard> deck = new LinkedList<>();

    public DeckBuilder defaultDeck(){
        int i = 0;

    }

    public DeckBuilder addCustomCard(DistrictCard card) {
        deck.add(card);
        return this;
    }

    public DeckBuilder removeCard() {
        deck.removeLast();
        return this;
    }

    public DeckBuilder WatchTower() {
        deck.add(new DistrictCard(District.RED, 1, "Watchtower"));
        deck.add(DistrictCard.Watchtower);
        return this;
    }

    public DeckBuilder Prison() {
        deck.add(new DistrictCard(District.RED, 2, "Prison"));
        return this;
    }

    public DeckBuilder Battlefield() {
        deck.add(new DistrictCard(District.RED, 3, "Battlefield"));
        return this;
    }

    public DeckBuilder Fortress() {
        deck.add(new DistrictCard(District.RED, 5, "Fortress"));
        return this;
    }

    public DeckBuilder Manor() {
        deck.add(new DistrictCard(District.YELLOW, 3, "Manor"));
        return this;
    }

    public DeckBuilder Castle() {
        deck.add(new DistrictCard(District.YELLOW, 4, "Castle"));
        return this;
    }

    public DeckBuilder Palace() {
        deck.add(new DistrictCard(District.YELLOW, 5, "Palace"));
        return this;
    }

    public DeckBuilder Tavern() {
        deck.add(new DistrictCard(District.GREEN, 1, "Tavern"));
        return this;
    }

    public DeckBuilder Market() {
        deck.add(new DistrictCard(District.GREEN, 2, "Market"));
        return this;
    }

    public DeckBuilder TradingPost() {
        deck.add(new DistrictCard(District.GREEN, 2, "Trading Post"));
        return this;
    }

    public DeckBuilder Docks() {
        deck.add(new DistrictCard(District.GREEN, 3, "Docks"));
        return this;
    }

    public DeckBuilder Harbor() {
        deck.add(new DistrictCard(District.GREEN, 4, "Harbor"));
        return this;
    }

    public DeckBuilder TownHall() {
        deck.add(new DistrictCard(District.GREEN, 5, "Town Hall"));
        return this;
    }

    public DeckBuilder Temple(){
        deck.add(new DistrictCard(District.BLUE, 1, "Temple"));
        return this;
    }

    public DeckBuilder Church(){
        deck.add(new DistrictCard(District.BLUE,2,"Church"));
        return this;
    }

    public DeckBuilder Monastery(){
        deck.add(new DistrictCard(District.BLUE,3,"Monastery"));
        return this;
    }

    public DeckBuilder Cathedral(){
        deck.add(new DistrictCard(District.BLUE,5,"Cathedral"));
        return this;
    }

    //TODO: Add unique cards!

    public LinkedList<DistrictCard> build(){
        return new LinkedList<>(deck);
    }




}
