Feature: Leads feature

  Background: 
    Given User navigates to Vtiger CRM
    And User logs in into vtiger
    When User navigates to leads page
    And clicks on create lead button

  Scenario Outline: Create and delete lead
    And creates a new lead with <name> and <company>
    Then New lead should be created
    When User deletes the newly created lead
    Then new lead should not be displayed in leads list
    And User signs out of vtiger

    Examples: 
      | name | company  |
      | ABC  | Infosys  |
      | BCD  | Cisco    |
      | CDE  | Deloitte |

  Scenario: Create and duplicate lead
    And creates a new lead with details
    Then New lead should be created and click on duplicate button
    When User duplicates the new lead
    Then duplicated lead should be created
    And User signs out of vtiger
