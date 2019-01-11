import cucumber.api.java8.En;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MyStepdefs implements En {

    private Something something;

    private String message;

    public MyStepdefs() {
        Given("^I have something$", () -> {
            something = new Something();
        });
        When("^I get a message from it$", () -> {
            message = something.message();
        });
        Then("^it should say \"([^\"]*)\"$", (String result) -> {
            assertThat(message, is(result));
        });
    }
}
