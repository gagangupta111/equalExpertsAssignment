package equalExperts;

import jdk.jshell.execution.Util;
import org.equalExperts.pojo.Product;
import org.equalExperts.util.Constants;
import org.equalExperts.util.Utility;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {

    @Test
    public void testProduct_CHEERIOS() {

        Double expected = 8.43;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.CHEERIOS);
        Double actual = jsonObject.getDouble(Constants.PRICE);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_CORNFLAKES() {

        Double expected = 2.52;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.CORNFLAKES);
        Double actual = jsonObject.getDouble(Constants.PRICE);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_FROSTIES() {

        Double expected = 4.99;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.FROSTIES);
        Double actual = jsonObject.getDouble(Constants.PRICE);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_SHREDDIES() {

        Double expected = 4.68;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.SHREDDIES);
        Double actual = jsonObject.getDouble(Constants.PRICE);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testProduct_WEETABIX() {

        Double expected = 9.98;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.WEETABIX);
        Double actual = jsonObject.getDouble(Constants.PRICE);

        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void test_jsonToPOJO() {

        Double expected = 9.98;

        JSONObject jsonObject = Utility.callAPIGetJSONObject(Constants.WEETABIX);
        Product actual = Utility.jsonToPOJO(jsonObject);

        Assert.assertEquals(expected, actual.getPrice(), 0.1);

    }

    @Test
    public void test_tax() {

        Double expected = 12.5;

        Double actual = Utility.taxCalculation(100.0);
        Assert.assertEquals(expected, actual, 0.0);

    }

}
