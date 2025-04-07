package equalExperts;

import org.equalExperts.contoller.Controller;
import org.equalExperts.util.Constants;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// 2 test cases to test 2 products individually, and 2 test cases for a combination of products

public class ControllerTest {

    @Test
    public void testProduct_Cheerios() {

        Double expected = 9.48375;

        String product = Constants.CHEERIOS;
        Map<String, Integer> map = new HashMap<>();
        map.put(product, 1);

        Controller controller = new Controller();
        Double actual = controller.fetchTotalOfProducts(map);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_CORNFLAKES() {

        Double expected = 2.835;

        String product = Constants.CORNFLAKES;
        Map<String, Integer> map = new HashMap<>();
        map.put(product, 1);

        Controller controller = new Controller();
        Double actual = controller.fetchTotalOfProducts(map);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_combination1() {

        Double expected = 27.3712;

        Map<String, Integer> map = new HashMap<>();
        map.put(Constants.FROSTIES, 3);
        map.put(Constants.SHREDDIES, 2);

        Controller controller = new Controller();
        Double actual = controller.fetchTotalOfProducts(map);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_combination2() {

        Double expected = 32.985;

        Map<String, Integer> map = new HashMap<>();
        map.put(Constants.WEETABIX, 2);
        map.put(Constants.SHREDDIES, 2);

        Controller controller = new Controller();
        Double actual = controller.fetchTotalOfProducts(map);

        Assert.assertEquals(expected, actual, 0.1);

    }

    //

}
