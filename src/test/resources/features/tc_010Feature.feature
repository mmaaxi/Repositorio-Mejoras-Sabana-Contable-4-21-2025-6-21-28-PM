Feature: Validar integridad global y consistencia de datos exportados

  Scenario: Exportar y validar datos
    Given que el usuario ha iniciado sesión correctamente en el sistema
    When el usuario exporta el informe en diferentes escenarios de uso
    Then el sistema permite múltiples exportaciones sin errores
    When el usuario realiza validaciones cruzadas de datos entre el sistema y el Excel
    Then las verificaciones muestran alta consistencia de datos
    When el usuario documenta cualquier discrepancia y valida contra casos de uso definidos
    Then la integridad global se mantiene conforme a las expectativas