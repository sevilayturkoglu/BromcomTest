@home
Feature: Home pages headers menu members

  Background:
    Given The user navigates to "bromUrl"

  Scenario:The user can see the headers menu members on the home page
    When The user can see those headers on the home page
      | Products  |
      | Pricing   |
      | Services  |
      | Resources |
      | Events    |
      | About Us  |

  Scenario:The user can see prices on the pricing page
    When The user can click the "Pricing" on the home page
    Then The user can see the price packages can choose for her school.
      | Standard      |
      | Plus          |
      | One-Stop Shop |

  Scenario Outline:The user can click the headers menu members on the home page
    When The user can click  these headers "<headers>" on the home page
    Then Verify that user can click the headers members and see "<pagesMember>"
    Examples:
      | headers   | pagesMember                            |
      | Products  | Local Authorities                      |
      | Pricing   | Find the right package for your school |
      | Services  | Bromcom AI                             |
      | Resources | Resource Hub                           |
      | Events    | Event Category                         |
      | About Us  | FAQs                                   |

