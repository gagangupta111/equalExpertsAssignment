package org.equalExperts.util;

import org.equalExperts.pojo.Product;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Utility {

    public static Double taxCalculation(Double originalValue){

        Double tax = (Constants.TAX*originalValue)/100;
        return tax;

    }

    public static Product jsonToPOJO(JSONObject jsonObject){

        String title = (String) jsonObject.get(Constants.TITLE);
        BigDecimal price = (BigDecimal) jsonObject.get(Constants.PRICE);

        return new Product(title, price.doubleValue());

    }

    public static JSONObject callAPIGetJSONObject(String product) {

        String url = Constants.URL + Constants.PRODUCT;
        JSONObject jsonObject = null;
        try {

            url = String.format(url, product);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            jsonObject = new JSONObject(response.body());

        } catch (Exception exception) {
            System.out.println(exception.getLocalizedMessage());
            return null;
        }
        return jsonObject;
    }

}

