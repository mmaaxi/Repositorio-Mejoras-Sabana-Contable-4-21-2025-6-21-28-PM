Feature: Verificar correcta asignación de columnas de IVA

  Scenario: Validar columnas y datos de IVA en exportación de Excel
    Given Que la exportación se ha ejecutado exitosamente
    When Se abre el archivo Excel generado
    Then El Excel se muestra con todas las columnas
    And Las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido' están presentes
    And Cada columna debe mostrar los datos y montos correctos según cálculos de IVA