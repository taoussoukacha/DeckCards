package cards;

import Utilities.SetUP;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DrawCards extends SetUP {
    String numberOfCards = "3";
    @Test
    public void drawCards() {
         given().
                relaxedHTTPSValidation()

                .when()
                .get("/new//draw/?count=" + numberOfCards + "")
                .then().statusCode(200)
                 .log().all();

    }
}
