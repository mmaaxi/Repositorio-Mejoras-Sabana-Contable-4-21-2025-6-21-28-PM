Feature: Validar actualización de fórmula 'Monto Acumulado Folio OPC 2121'

  Scenario: Exportar y verificar fórmula de 'Monto Acumulado Folio OPC 2121'
    Given El informe ha sido exportado
    When Reviso la columna 'Monto Acumulado Folio OPC 2121' en el Excel
    Then El campo aparece en el Excel

    When Verifico que la fórmula incluya todos los montos relevantes
    Then Los valores calculados son consistentes y correctos

    When Comparo con la documentación técnica
    Then La fórmula cumple con los requerimientos técnicos esperados