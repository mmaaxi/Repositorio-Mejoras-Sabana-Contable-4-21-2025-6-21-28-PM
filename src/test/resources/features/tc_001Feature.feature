Feature: Validate export report with new column order

  Scenario: Export 'Claim Accounting Report' with specific column order
    Given the user navigates to the report generation module in the BaNCS system
    When the user selects the option to export the 'Claim Accounting Report'
    Then the exported Excel contains columns in the specified new order