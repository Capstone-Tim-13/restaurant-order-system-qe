@Login
Feature: User can login
  I want to use this template for my feature file

  @Login-with-regist-account
  Scenario: as a user I can login with registered account
  Given user on the login page
  When i input valid email
  And i input correct password
  And i click enter button
  Then i directed to homepage
  
  @Login-with-unregistered-account
  Scenario: as a user I cannot login with unregistered account
  Given user on the login page
  When i input unregistered email
  And i input unregistered password
  And i click enter button
  Then error message unregistered is displayed
  
  @Login-with-wrong-password
  Scenario: as a user I cannot login with wrong password
  Given user on the login page
  When i input valid email
  And i input wrong password
  And i click enter button
  Then error message wrong password is displayed
  
  