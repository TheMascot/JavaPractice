package OOP_Projects.Playable_Tic_Tac_Toe;

public class Messages {

    public static void displayHeader() {
        System.out.println("""
                *****************************
                *        TIC-TAC-TOE        *
                *****************************""");
    }

    public static void displayInfoMessage(char c) {
        System.out.printf("*****************************\n*  Az Ön jele az: %s,        *\n",c);
        System.out.println("""
                *  lépéseit a sor számának  *
                *  és az oszlop betűjének   *
                *  megadásával teheti meg.  *
                *  Például: 1a vagy 3b      *
                *  Jó játékot kívánok!      *
                *****************************""");
    }

        public static void displayPlayerSignChoice () {
            System.out.println("* X-el O-val szeretne       *\n" +
                    "* játszani? (X fog kezdeni) *");
            System.out.print("*");
        }

        public static void displayWhereToPlaceNextPlayerSign (Player player){
            System.out.println("Hová kerüljön a következő " + player.getPlayersSign() + "?");
        }

        public static void displayIncorrectInputErrorMessage () {
            System.out.println("Nem megfelelő input. A sor számát és az oszlop betűjét adja meg.");
        }

        public static void displayPopulatedFieldErrorMessage () {
            System.out.println("Ez a mező már foglalt.");
        }

        public static void displayPlayerWon () {
            System.out.println("Gratulálok! Ezt a játékot Ön nyerte!");
        }
        public static void displayOpponentWon () {
            System.out.println("Ezt a játszmát a számítógép nyerte.");
        }

        public static void displayGameEndsWithTie () {
            System.out.println("A játék döntetlen lett.");
        }

        public static void displayOpponentsMoveText () {
            System.out.println("Az ellenfél lépése:");
        }

        public static void displayLastMessage () {
            System.out.println("Köszönöm a játékot!");
        }

    }
