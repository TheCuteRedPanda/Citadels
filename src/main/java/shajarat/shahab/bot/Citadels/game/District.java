package shajarat.shahab.bot.Citadels.game;

public enum District {
    YELLOW("Noble"),
    BLUE("Religious"),
    GREEN("Trade"),
    RED("Military"),
    PINK("UNIQUE");

    private final String districtType;

    District(String districtType){
        this.districtType = districtType;
    }

    public String getDistrictType(){
        return districtType;
    }

}
