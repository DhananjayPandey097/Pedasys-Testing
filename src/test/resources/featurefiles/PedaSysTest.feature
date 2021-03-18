Feature: growth engineering Feature

  Scenario: Check that all menu links in the top navigation work (Our Products to Get in Touch)
    Given user launches the link
    When title of the page is GROWTH
    Then user validate Our Product menu option present on screen
    Then user validate Our Approach menu option present on screen
    Then user validate Resources menu option present on screen
    Then user validate AboutUs menu option present on screen
    Then user validate GetInTouch menu option present on screen