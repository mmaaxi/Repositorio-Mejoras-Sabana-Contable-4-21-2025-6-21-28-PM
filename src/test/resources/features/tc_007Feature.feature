Feature: Confirmar generación de columnas para futuros valores

  Scenario: Verificar la aparición y conformidad de columnas generadas
    Given el usuario ha exportado el archivo Excel
    When se localizan las columnas 'Folio Pre solicitud' y 'Folio de Pago'
    Then ambas columnas se muestran aunque sin datos iniciales
    And los campos permiten la incorporación futura de datos
    And la estructura y comportamiento son correctos de acuerdo al requerimiento