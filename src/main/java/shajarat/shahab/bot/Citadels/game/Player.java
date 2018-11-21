package shajarat.shahab.bot.Citadels.game;

import net.dv8tion.jda.core.MessageBuilder;
import net.dv8tion.jda.core.entities.User;

import java.util.ArrayList;

public class Player {

    private final User user;
    private int gold;
    boolean king;
    private ArrayList<DistrictCard> hand;
    private City city;
    private int builds;
    private String ID;
    private int index;

    public Player(User user, boolean king, String ID) {
        this.user = user;
        this.gold = 2;
        this.king = false;
        this.hand = new ArrayList<DistrictCard>();
        this.builds = 1;
        this.ID = ID;
    }

    public User getUser() {
        return user;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int amount){
        this.gold = this.gold + amount;
    }

    public void drawCard(){
        DistrictCard card = CitadelsGame.drawCard();
        this.getUser().openPrivateChannel().queue((channel)->{
            channel.sendMessage(new MessageBuilder("You just drew " + card.toString() + " !").build()).queue();
        });

        hand.add(CitadelsGame.drawCard());
    }

    public int getBuilds() {
        return builds;
    }

    public void setBuilds(int builds) {
        this.builds = builds;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing() {
        this.king = true;
    }

    public void removeKing(){
        this.king = false;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<DistrictCard> getHand() {
        return hand;
    }

    public boolean addCard(DistrictCard card){
        hand.add(card);
        return true;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setHand(ArrayList<DistrictCard> hand) {
        this.hand = hand;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Player{" +
                user.getName() + '\'' +
                '}';
    }

}
