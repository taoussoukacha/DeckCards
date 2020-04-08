package deck;

import Utilities.SetUP;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class NewDeck extends SetUP {

    @Test
    //Add a new deck
    public void NewDeck(){
        given().
                relaxedHTTPSValidation().

                when()
                .get("new/")
                .then()
                .statusCode(200).log().body();
    }
}

