Feature: automated end2end test
  Description: The purpose of test  is end to end test site "https://practice.bpbonline.com/"

  # The first example has two steps
  Scenario: user will go to loginPage and sign to  page
    Given user is on Homepage
    When user clicks on myAccount button

