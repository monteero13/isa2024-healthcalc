Feature: Cálculo del Peso Ideal de una Persona

  Como usuario de la calculadora de salud,
  quiero poder calcular el peso ideal de una persona
  para ayudar a establecer objetivos de peso saludables.

  Scenario: Calculando el Peso Ideal para una Persona de Sexo Masculino

    Given que ingreso la altura de la persona como 175 cm
    When selecciono el género masculino y presiono el botón de calcular
    Then la calculadora muestra que el peso ideal para la persona es de aproximadamente 68.75 kg

  Scenario: Calculando el Peso Ideal para una Persona de Sexo Femenino

    Given que ingreso la altura de la persona como 155 cm
    When selecciono el género femenino y presiono el botón de calcular
    Then la calculadora muestra que el peso ideal para la persona es de aproximadamente 53 kg
