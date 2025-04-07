package org.equalExperts.contoller;

import org.equalExperts.pojo.Product;
import org.equalExperts.util.Utility;
import org.json.JSONObject;

import java.util.Map;

public class Controller {

    public Double fetchTotalOfProducts(Map<String, Integer> products){

        // call utility with these products
        // transform them into values from utility
        // add all values together and get tax from utility
        // return the final taxed value

        Double total = 0.0;
        for (String key : products.keySet()){

            Integer times = products.get(key);

            JSONObject jsonObject = Utility.callAPIGetJSONObject(key);
            Product product = Utility.jsonToPOJO(jsonObject);
            total += product.getPrice()*times;
        }

        total += Utility.taxCalculation(total);
        return total;

    }

}
