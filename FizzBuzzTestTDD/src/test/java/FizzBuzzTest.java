
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";
    public static final String FIZZBUZZ = "FIZZBUZZ";
    private FizzBuzz game;
    @Before
    public void before(){
        game=new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5(){
        List<String> numbersList=game.getNumbers();
        Assert.assertEquals("1",numbersList.get(0));
        Assert.assertEquals("2",numbersList.get(1));
        Assert.assertEquals("7",numbersList.get(6));
        Assert.assertEquals("13",numbersList.get(12));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf3(){
        List<String> numbersList=game.getNumbers();
        Assert.assertEquals(FIZZ,numbersList.get(5));
        Assert.assertEquals(FIZZ,numbersList.get(8));
        Assert.assertEquals(FIZZ,numbersList.get(11));
        Assert.assertEquals(FIZZ,numbersList.get(2));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf5(){
        List<String> numbersList=game.getNumbers();
        Assert.assertEquals(BUZZ,numbersList.get(24));
        Assert.assertEquals(BUZZ,numbersList.get(4));
        Assert.assertEquals(BUZZ,numbersList.get(9));
        Assert.assertEquals(BUZZ,numbersList.get(19));
    }

    @Test
    public void should_returnFizzBuzz_whenAMultipleOf5And3(){
        List<String> numbersList=game.getNumbers();
        Assert.assertEquals(FIZZBUZZ,numbersList.get(14));
        Assert.assertEquals(FIZZBUZZ,numbersList.get(29));
        Assert.assertEquals(FIZZBUZZ,numbersList.get(59));
        Assert.assertEquals(FIZZBUZZ,numbersList.get(89));
    }



}
