import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    Dice dice;

    @BeforeEach
    void setUp() {
        this.dice = new Dice(2);
    }

    @Test
    void tossAndSum() {
        //Given

        //When -- We are calling the methods we are testing.
        Integer actual = dice.tossAndSum();

        //Then/Assert
        Assert.assertTrue(actual < 13 && actual > 1);
    }
}