Feature: Cálculo de la Tasa Metabólica Basal de una Persona

  Como usuario de la calculadora de salud,
  quiero poder calcular la tasa metabólica basal (TMB) de una persona
  para estimar sus necesidades calóricas diarias.

  Scenario Outline: Calculando la TMB para una persona con diferentes características

    Given que ingreso la edad de la persona como <age> anos, el peso como <weight> kg y la altura como <height> cm
    When selecciono el genero "<gender>" y presiono el boton de calcular TMB
    Then la calculadora muestra que la TMB para la persona es de aproximadamente <expected_TMB> kcal/dia

    Examples:
      | age | weight | height | gender | expected_TMB |
      | 80  | 90     | 167    | H      | 1548.75      |
      | 25  | 60     | 150    | M      | 1251.50      |
