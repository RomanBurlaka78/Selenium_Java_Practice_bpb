Feature: Create Account
  As a new user
  I want to create an account on the webpage
  So that I can access the website's features

  Scenario: Create a new account
    Given I am on the homepage
    When I click button myAccount and redirect to login page
    When I click button Continue and redirect to create_account page
    And I enter input forms for My Account Information
    And I submit the registration form
    Then I should see a successful registration message
    Then I click button Continue and redirect to account user page
    Then I click button Log off and user  log out  from account page
    Then I click button Continue and redirect to Home  page


  Scenario: Login user in existing account
    Given I am on the homepage
    When  I click myAccount and redirect to login page
    And   I fill email, password in inputs form and click "Sign IN"
    Then I on users account, click myAccount and redirect me  to account page
    Then I click on  "View or change my account information"
    Then  I am on account_edit page, shows information about user
    And I change First name, Last name and click "Continue"
    Then  I am on the account page


