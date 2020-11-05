import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArr {
    Main main;

    @Before
    public void prepare() {
        main = new Main();
        System.out.println("@Before");
    }


    @Test
    public void testArr1() {
//        Main main = new Main();
        Integer[] arr = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertTrue(main.checkArray2(arr));
    }

    @Test
    public void testArr2() {
        Integer[] arr = {1, 1, 1, 1, 1, 1};
        Assert.assertFalse(main.checkArray2(arr));
    }

    @Test
    public void testArr3() {
        Integer[] arr = {4, 4, 4, 4};
        Assert.assertFalse(main.checkArray2(arr));
    }

    @Test
    public void testArr4() {
        Integer[] arr = {1, 4, 4, 1, 1, 4, 3};
        Assert.assertFalse(main.checkArray2(arr));
    }

}
