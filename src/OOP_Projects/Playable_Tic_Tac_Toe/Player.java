package OOP_Projects.Playable_Tic_Tac_Toe;

public class Player {

    char playersSign;
    boolean playersTurn = false;

    public Player(char sign){
        setPlayersSign(sign);
        setPlayersTurn(sign);
    }

    public char getPlayersSign() {
        return playersSign;
    }

    public void setPlayersSign(char playersSign) {
        if(playersSign == 'X' || playersSign == 'O'){
        this.playersSign = playersSign;
        }
    }

    public boolean isPlayersTurn() {
        return playersTurn;
    }

    public void togglePlayersTurn() {
        this.playersTurn = !this.playersTurn;
    }

    private void setPlayersTurn(char playersSign) {
        if(playersSign == 'X') this.playersTurn = true;
        else if(playersSign == 'O') this.playersTurn = false;
    }
}
