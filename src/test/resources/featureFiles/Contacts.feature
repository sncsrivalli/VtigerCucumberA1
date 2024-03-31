Feature: Contacts feature

  Background: 
    Given User navigates to Vtiger CRM
    And User logs in into vtiger
    When User navigates to contacts page
    And clicks on create contact button

  Scenario Outline: Create and delete contact
    And creates a new contact with <name>
    Then New contact should be created
    When User deletes the newly created contact
    Then new contact should not be displayed in contacts list
    And User signs out of vtiger

    Examples: 
      | name  |
      | Scott |
      | Mark  |
      | Tiger |

  Scenario: Create contact with organization
    And creates a contact with existing organization
    Then New contact should be created
    When User deletes the newly created contact
    Then new contact should not be displayed in contacts list
    And User signs out of vtiger
