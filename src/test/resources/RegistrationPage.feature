Feature: check registration number
  As a end User
  I want to enter registration number
  so that i can check that vehicle exist or not

  @smoke
  Scenario:
    Given user is on vehicle registration page
    When user enter the vehicle registration no "OV12UYY"
    And user click on find button
    Then user should able to see his vehicle cover details