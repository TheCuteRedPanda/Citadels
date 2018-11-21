package shajarat.shahab.bot.Citadels.game;


import net.dv8tion.jda.core.MessageBuilder;
import shajarat.shahab.bot.Citadels.game.Characters.Character;

import java.util.ArrayList;

public class SelectionPhase {


    public static void startSelection(ArrayList<Player> players, ArrayList<Character> characters) {
        switch (players.size()) {
            case 2:
                TwoPlayer(players, characters);
                break;
            case 3:
                ThreePlayer(players, characters);
                break;
            case 4:
                FourPlayer(players, characters);
                break;
            case 5:
                FivePlayer(players, characters);
                break;
            case 6:
                SixPlayer(players, characters);
                break;
            case 7:
                SevenPlayer(players, characters);
                break;
            case 8:
                EightPlayer(players, characters);
                break;
            default:
                DeveloperMode(players, characters);
        }

    }

    private static void TwoPlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void ThreePlayer(ArrayList<Player> players, ArrayList<Character> characters) {
        characters = discardFaceDown(characters);



    }

    private static void FourPlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void FivePlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void SixPlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void SevenPlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void EightPlayer(ArrayList<Player> players, ArrayList<Character> characters) {

    }

    private static void DeveloperMode(ArrayList<Player> players, ArrayList<Character> characters) {

    }


    public static ArrayList<Character> discardFaceUp(ArrayList<Character> characters) {
        int number = Randomize.newInt(0, characters.size());

        while (characters.get(number).getRank() == 4)
            number = Randomize.newInt(0, characters.size());

        Character card = characters.get(number);
        characters.remove(number);

        CitadelsGame.citadelsChannel.sendMessage(new MessageBuilder(card.toString() + " Was discarded for this round!").build()).queue();

        return characters;
    }

    public static ArrayList<Character> discardFaceDown(ArrayList<Character> characters) {
        int number = Randomize.newInt(0, characters.size());

        characters.remove(number);

        CitadelsGame.citadelsChannel.sendMessage(new MessageBuilder(" A mystery character card was discarded for this round!").build()).queue();

        return characters;

    }

}
