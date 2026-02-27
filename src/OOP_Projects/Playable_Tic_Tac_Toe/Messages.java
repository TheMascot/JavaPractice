package OOP_Projects.Playable_Tic_Tac_Toe;

public class Messages {

    public static void displayWelcomeMessage() {
        System.out.println("""
                ***************************
                *       TIC-TAC-TOE       *
                ***************************
                * Ön az X-el játszik,     *
                * lépéseit a sor számának *
                * és az oszlop betűjének  *
                * megadásával teheti meg. *
                * Például: 1a vagy 3b     *
                * Jó játékot!             *
                ***************************""");
    }

    public static void displayWhereToPlaceNextPlayerSign(Player player) {
        System.out.println("Hová kerüljön a következő " + player.getPlayersSign());
    }

    public static void displayIncorrectInputMessage() {
        System.out.println("Nem megfelelő input. A sor számát és az oszlop betűjét adja meg.");
    }

}
