Feature: Test for animal

  Scenario: Dog makes some sound
    Given I have an animal
    When The animal makes sound
    Then I expect dog make sound