package shajarat.shahab.bot.Citadels.game;

public class Randomize {

    public static int newInt(int min, int max){
        return (int) (Math.random() * (max - min) + 1) + min;
    }
}
