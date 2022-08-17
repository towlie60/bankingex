package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankTransactions {
    @And("^Verify that web title is \"([^\"]*)\"$")
    public void verifyThatWebTitleIs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User logs in with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLogsInWithAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User successfully logged in to home page$")
    public void userSuccessfullyLoggedInToHomePage() {
    }

    @Given("^User navigates to Deposit page$")
    public void userNavigatesToDepositPage() {
    }

    @When("^User submits a deposit with the following info$")
    public void userSubmitsADepositWithTheFollowingInfo() {
    }

    @Then("^Verify field error message \"([^\"]*)\" is displayed$")
    public void verifyFieldErrorMessageIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify alert error message \"([^\"]*)\" is displayed$")
    public void verifyAlertErrorMessageIsDisplayed(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that deposit amount has been applied with the following$")
    public void verifyThatDepositAmountHasBeenAppliedWithTheFollowing() {
    }

    @Given("^User navigates to Withdraw page$")
    public void userNavigatesToWithdrawPage() {
    }

    @When("^User User submits a withdraw without selected account$")
    public void userUserSubmitsAWithdrawWithoutSelectedAccount() {
    }

    @When("^User User submits a withdraw without amount$")
    public void userUserSubmitsAWithdrawWithoutAmount() {
    }

    @When("^User submits a withdraw with invalid amount$")
    public void userSubmitsAWithdrawWithInvalidAmount() {
    }

    @And("^User selects withdraw account as \"([^\"]*)\"$")
    public void userSelectsWithdrawAccountAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User submits a withdraw with \"([^\"]*)\" amount$")
    public void userSubmitsAWithdrawWithAmount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify that withdraw amount has been applied`$")
    public void verifyThatWithdrawAmountHasBeenApplied() {
    }
}
