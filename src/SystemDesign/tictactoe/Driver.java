package SystemDesign.tictactoe;

import SystemDesign.tictactoe.enums.PlayerType;
import SystemDesign.tictactoe.factories.GameFactories;
import SystemDesign.tictactoe.players.Player;

public class Driver {

    public static void main(String[] args) {
        System.out.println(Math.round(4.4));
        Game tictactoe= GameFactories.launch(3, PlayerType.HUMAN,PlayerType.HUMAN);
        //tictactoe.run();
    }
}
