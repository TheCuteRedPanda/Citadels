package shajarat.shahab.bot.Citadels.game;

import java.util.ArrayList;
import java.util.List;

public class City {
    private final Player owner;
    private ArrayList<DistrictCard> districts;
    private boolean protection = false;

    public City(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }

    public List<DistrictCard> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<DistrictCard> builtDistricts) {
        this.districts = builtDistricts;
    }

    public boolean isProtected() {
        return protection;
    }

    public void protect(boolean protection) {
        this.protection = protection;
    }

    public boolean destroy(DistrictCard target) {
        for (DistrictCard card : districts)
            if (card.equals(target)) {
                districts.remove(card);
                return true;
            }
        return false;
    }
}
