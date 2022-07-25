package Helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class APIHelper {

    
    public static <T> T jsonToPojo(Response response , Class<T> tClass) {
        String explrObject = response.getBody().asPrettyString();
        T t = null;
        try {
            Gson gson = new Gson();
            t = gson.fromJson(explrObject, tClass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static String stringToJson(JSONObject jsonObject) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = new JsonParser().parse(jsonObject.toString());

        return gson.toJson(je);
    }

    private static RequestSpecification requestSpecification() {
        return RestAssured.given();
    }

    public static Response postResponse_WithBody(String url, String payload) {

        return requestSpecification()
                .header("Content-Type", "application/json")
                .body(payload)
                .post(url);
    }

    public static Response putResponse_WithBody(String url, String payload) {
        return requestSpecification()
                .header("Content-Type", "application/json")
                .body(payload)
                .put(url);
    }

    public static Response deleteResponse(String url, int id) {
        return requestSpecification()
                .header("Content-Type", "*/*")
                .delete(url + id);
    }

}
