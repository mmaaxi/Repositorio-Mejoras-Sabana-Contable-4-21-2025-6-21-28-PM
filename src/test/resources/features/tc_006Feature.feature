Feature: Modificación de fórmula 'IVA Acumulado'

  Scenario: Verificar modificación de fórmula 'IVA Acumulado'
    
    Given el usuario ha exportado los datos y puede acceder a la columna 'IVA Acumulado'
    When el usuario confirma que la modificación excluye el IVA retenido
    Then el cálculo refleja la exclusión de IVA retenido de forma precisa
    And los resultados son consistentes y validados contra datos esperados aprobados