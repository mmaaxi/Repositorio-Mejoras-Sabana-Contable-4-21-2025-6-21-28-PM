Feature: Validar aparición y fórmula de 'Monto acumulado Folio Reserva 5401'

  Scenario: Realizar la exportación y verificar la columna y fórmula en Excel
    Given el usuario ha iniciado sesión en el sistema
    When el usuario realiza la exportación del informe
    Then el proceso de exportación se ejecuta sin errores
    When el usuario abre el Excel exportado
    Then la columna 'Monto acumulado Folio Reserva 5401' está presente en el archivo
    When el usuario verifica la fórmula aplicada en la columna
    Then la fórmula refleja los cálculos previstos sin discrepancias