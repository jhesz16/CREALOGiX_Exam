package API;

import Data.PetData;
import POJO.Pet;
import com.google.gson.Gson;
import com.sun.org.glassfish.gmbal.Description;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Helpers.APIHelper.*;
import static io.restassured.RestAssured.get;


public class APITests {

    public final String URL = "https://petstore3.swagger.io/api/v3/pet/";
    public Pet genericPet = new PetData().genericPet();

    @BeforeTest
    public void setup() {

    }

    @Test(priority = 0)
    @Description("Obtain all “available” pets")
    public void obtainAllAvailablePets() {
        Response response = get(URL + "findByStatus?status=available");

        Assert.assertEquals(response.getStatusCode(), 200);

        JSONArray jsonArray = new JSONArray(response.getBody().asPrettyString());
        System.out.println("Found " + jsonArray.length() + " pets.");
        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(stringToJson(jsonArray.getJSONObject(i)));
        }
    }


    @Test(priority = 1)
    @Description("Add a new pet")
    public void addNewPet() {
        Response response = postResponse_WithBody(URL, new Gson().toJson(genericPet));
        Pet petResponse = jsonToPojo(response, Pet.class);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(petResponse.id, genericPet.id);

        JSONObject jsonObject = new JSONObject(response.getBody().asPrettyString());
        System.out.println(stringToJson(jsonObject));

    }

    @Test(priority = 2)
    @Description("Change the status of a pet to “sold”")
    public void ChangeTheStatusOfAPetToSold() {
        genericPet.setStatus("sold");
        Response response = putResponse_WithBody(URL, new Gson().toJson(genericPet));
        Pet petResponse = jsonToPojo(response, Pet.class);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(petResponse.status, "sold");

        System.out.println(response.getBody().asPrettyString());
    }

    @Test(priority = 3)
    @Description("Delete an existent pet")
    public void DeleteAnExistentPet() {
        Response response = deleteResponse(URL, genericPet.getId());

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.getBody().prettyPrint(), "Pet deleted");
    }
}
