package deck;

import Utilities.SetUP;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class NewDeckWithJoker extends SetUP {
    @Test
    //new deck with enabled joker using Get
    public void getDeckWithJokers() {
        given().
                relaxedHTTPSValidation().param("jokers_enabled", true)

                .when()
                .get("/new/")
                .then().statusCode(200)
                .log().all();

    }
    @Test
    //new deck with enabled joker using post, Note the post request is returning 403,
    public void postDeckWithJokers() {
        given().
                relaxedHTTPSValidation().param("jokers_enabled", true)
                .header("Accept", ContentType.JSON.getAcceptHeader())
                .post("/new/")
                .then().statusCode(200)
                .log().all();
    }
}
