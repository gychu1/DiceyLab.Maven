import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    Bins bins;

    @BeforeEach
    void setUp() {
        this.bins = new Bins(2,12);
    }

    @Test
    void getBin() {
        bins.incrementBin(2);
        Integer actual = bins.getBin(2);

        Assert.assertTrue(actual==1);
    }

    @Test
    void incrementBin() {

        for (int i = 1; i <= 10000; i++) {
            bins.incrementBin(2);
        }

        Integer actual = bins.getBin(2);

        Assert.assertTrue(actual==10000);
    }
}