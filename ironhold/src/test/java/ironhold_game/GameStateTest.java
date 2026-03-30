package ironhold_game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    GameState gameState = new GameState();
    @BeforeEach

    @Test
    void test_InitializeStockpile() {

       assertEquals(4, gameState.getStockpile().size());
    }


}