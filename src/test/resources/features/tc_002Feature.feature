Feature: Verify the 'Estado Código' column and its position

  Scenario: Validate 'Estado Código' column position in the exported Excel report
    Given the user has exported the report
    When the user opens the generated Excel file
    Then the file opens without errors
    And the 'Estado Código' column should appear next to column 'i'
    And the order of columns matches the requirements document