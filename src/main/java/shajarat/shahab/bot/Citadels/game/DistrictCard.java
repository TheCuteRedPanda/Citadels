package shajarat.shahab.bot.Citadels.game;

public class DistrictCard {
    private District district;
    private int cost;
    private Player player;
    private String name;


    public static final DistrictCard Watchtower = new DistrictCard(District.RED, 1, "Watchtower");
    public static final DistrictCard Prison = new DistrictCard(District.RED, 2, "Prison");
    public static final DistrictCard Battlefield = new DistrictCard(District.RED, 3,"Battlefield");
    public static final DistrictCard Fortress = new DistrictCard(District.RED, 5, "Fortress");

    public DistrictCard(District district, int cost, String name) {
        this.district = district;
        this.cost = cost;
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "the district card \t{ " +
                "district = " + district +
                ", cost = " + cost +
                ", name = '" + name + '\'' +
                '}';
    }
}
