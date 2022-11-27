import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutlierTest {
    private Outlier outlier;

    @BeforeEach
    void setUp(){
        outlier = new Outlier();
    }

    @Test
    void testThatArrayOfEvenNumberIsReturnedAfterOddNumberIsEliminated(){
        int [] arr = {2,3,4,6,8,10};
        assertArrayEquals(new int[]{2,4,6,8,10},outlier.returnedArr(arr));
    }

}