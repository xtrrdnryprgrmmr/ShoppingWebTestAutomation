$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Feature\\AllStep.feature");
formatter.feature({
  "name": "AllStep.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllStep"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllStep"
    }
  ]
});
formatter.step({
  "name": "Any browser opens",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "AutomationPractice page is visited.",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.openPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click sign in button and verify login page is opened",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.clickSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click create an account button and verify personal information page is opened",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.clickAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill First Name area",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Last Name area",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Password area",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Address area",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Address Line 2",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillAddressLine()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill City",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerCity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill State",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerState()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Postal Code",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerPostCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Country",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Mobile phone",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerMobilePhone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill Assign an address alias for future reference.",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.fillCustomerAddressAlias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Register button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.clickRegisterForNewUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see my account page and see firstname lastname in page and sign out button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyAccountOperationSuccessfull()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dress tab is selected",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.clickDress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Summer dress option is selected",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.clickSummerDress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose first product and click add to chart button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.addProductToChart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User observe chart pop up is opened and product successfully added to shopping chart",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyProductToChartAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user observe SHOPPING-CART SUMMARY  - order page is opened and click Proceed to checkout button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifySummaryStepMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see adress page is opened and click Proceed to checkout button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyAddressStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see shipping page is opened and click terms of service checkbox",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyShippingStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see payment page and chose bank-wire payment option",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyPaymentStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see order summary page is opened and click  I confirm my order button",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyOrderSummaryStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user observe ORDER CONFIRMATION page is opened and see order deatils",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyOrderConfirmationStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login page and use click order history and details",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyOrderHistoryAndDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user observe completed product order",
  "keyword": "* "
});
formatter.match({
  "location": "AddToBasket.verifyOrderCompletedExpected()"
});
formatter.result({
  "status": "passed"
});
});