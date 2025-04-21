Feature: Verificar renombramiento de columna 'Status de Pago'

  Scenario: Renombramiento y validación de columna 'Status de Pago'
    Given el informe ha sido exportado
    When localizo la columna renombrada
    Then la columna 'Status de Pago' debe mostrarse como 'Descripción Status Pago'
    And no deben existir duplicaciones o errores de nomenclatura
    And la nomenclatura debe ser validada contra el documento de requerimientos