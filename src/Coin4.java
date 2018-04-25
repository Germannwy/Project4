
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class Coin4 {

    public CoinAmountTest() {
    }
    @Test
    public void testLessThanEqualToZero() {
        CoinAmount coins = new CoinAmount();
        ArrayList<Integer> test0, test1 = new ArrayList<>();
        int coinType[] = {1, 5, 10, 25};
        test0 = coins.coinAmountCount(coinType, -1);
        assertEquals(test0, test1);
    }
    @Test
    public void testEmptyArray() {
        CoinAmount coins = new CoinAmount();
        ArrayList<Integer> test0, test1 = new ArrayList<>();
        int coinType[] = new int[0];
        test0 = coins.coinAmountCount(coinType, 0);
        assertEquals(test0, test1);
    }
    @Test
    public void Change() {
        CoinAmount coins = new CoinAmount();
        ArrayList<Integer> test0, test1 = new ArrayList<>();
        int coinType[] = {1, 5, 10, 25};
        test0 = coins.coinAmountCount(coinType, 27);
        test1.add(1);
        assertEquals(test0, test1);
    }
    @Test
    public void testNullArray() {
     	CoinAmount coins = new CoinAmount();
        ArrayList<Integer> test0, test1 = new ArrayList<>();
        int coinType[] = {};
        test0 = coins.coinAmountCount(coinType, 0);
        assertEquals(test0, test1);
    }


}
