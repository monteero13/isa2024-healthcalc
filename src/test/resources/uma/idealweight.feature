Feature: Cálculo del Peso Ideal de una Persona

  Como usuario de la calculadora de salud,
  quiero poder calcular el peso ideal de una persona
  para ayudar a establecer objetivos de peso saludables.

  Scenario Outline: Calculando el Peso Ideal para una Persona con diferentes géneros

    Given que ingreso la altura de la persona como <height> cm
    When selecciono el genero "<gender>" y presiono el boton de calcular
    Then la calculadora muestra que el peso ideal para la persona es de aproximadamente <expected_weight> kg

    Examples:
      | height | gender | expected_weight |
      | 175    | H      | 68.75           |
      | 155    | M      | 53              |
