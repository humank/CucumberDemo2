package solid.humank.checkoutDemo2.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import solid.humank.checkoutDemo2.impl.Checkout;

import static org.junit.Assert.assertEquals;


/**
 * Created by yikai on 2015/3/28.
 */
public class CheckoutSteps {

    int bananaPrice;
    String checkoutItemName;
    Checkout checkout;


    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
        checkoutItemName = name;

    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int count, String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkout = new Checkout();
        checkoutItemName = name;
        checkout.add(count, bananaPrice);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(checkout.total(), total);

    }
}
