import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

   /* @BeforeAll
    void setup() {
        BowlingGame bowlingGame = new BowlingGame();
    }*/


    @Test
    void addPlayer (){
        //GIVEN
        BowlingGame bowlingGame = new BowlingGame();
        String name = "Leonardo";
        int points = 343;
        //WHEN
        bowlingGame.addPlayer(name,points);
        //THEN
        assertEquals(name,"Leonardo");
        assertEquals(points, 343);
    }



}

