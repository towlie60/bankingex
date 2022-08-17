package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^User navigates to Digital Bank login page$")
    public void userNavigatesToDigitalBankLoginPage() {
    }

    @When("^User logs in with following credentials$")
    public void userLogsInWithFollowingCredentials() {
    }

    @Then("^User should successfully be logged in to home page$")
    public void userShouldSuccessfullyBeLoggedInToHomePage() {
    }

    @Then("^User should be displayed with the error message \"([^\"]*)\"$")
    public void userShouldBeDisplayedWithTheErrorMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that \"([^\"]*)\" welcoming message is displayed$")
    public void verifyThatWelcomingMessageIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that home page panel with account info is displayed$")
    public void verifyThatHomePagePanelWithAccountInfoIsDisplayed() {
    }

    @Then("^Verify that \"([^\"]*)\" dropdown has following options$")
    public void verifyThatDropdownHasFollowingOptions(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^User clicks on new \"([^\"]*)\" account$")
    public void userClicksOnNewAccount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User creates Checking account with the following info$")
    public void userCreatesCheckingAccountWithTheFollowingInfo() {
    }

    @Then("^verify newly created account information contains$")
    public void verifyNewlyCreatedAccountInformationContains() {
    }

    @And("^User clicks on \"([^\"]*)\" account$")
    public void userClicksOnAccount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User submits checking account without Account Name$")
    public void userSubmitsCheckingAccountWithoutAccountName() {
    }

    @When("^User submits checking account with \"([^\"]*)\" deposit$")
    public void userSubmitsCheckingAccountWithDeposit(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User creates \"([^\"]*)\" account with following info and click Reset button$")
    public void userCreatesAccountWithFollowingInfoAndClickResetButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that fields are reset to default values$")
    public void verifyThatFieldsAreResetToDefaultValues() {
    }
}
