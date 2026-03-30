package oop_projects.dicegame;

public class GameSetup {

    private final PlayField playField;
    private final Player player1;
    private final Player player2;

    public GameSetup(PlayField playField, Player player1, Player player2){
        this.playField = playField;
        this.player1 = player1;
        this.player2 = player2;
    }

    public PlayField getPlayField() {
        return playField;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
