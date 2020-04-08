package Utilities;

import io.restassured.RestAssured;
import org.junit.Before;

public class SetUP {
    @Before
    public void  setUP(){
        RestAssured.baseURI = "https://deckofcardsapi.com";
        RestAssured.basePath = "/api/deck";
    }
}
