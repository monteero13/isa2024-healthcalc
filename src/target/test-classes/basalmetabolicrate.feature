Feature: Cálculo de la Tasa Metabólica Basal de una Persona

  Como usuario de la calculadora de salud,
  quiero poder calcular la tasa metabólica basal (TMB) de una persona
  para estimar sus necesidades calóricas diarias.

  Scenario: Calculando la TMB para una persona de 80 años de edad, 90 kg de peso, 167 cm de altura y sexo masculino

    Given que ingreso la edad de la persona como 80 años, el peso como 90 kg y la altura como 167 cm
    When selecciono el género masculino y presiono el botón de calcular TMB
    Then la calculadora muestra que la TMB para la persona es de aproximadamente 1548.75 kcal/día

  Scenario: Calculando la TMB para una persona de 25 años de edad, 60 kg de peso, 150 cm de altura y sexo femenino

    Given que ingreso la edad de la persona como 25 años, el peso como 60 kg y la altura como 150 cm
    When selecciono el género femenino y presiono el botón de calcular TMB
    Then la calculadora muestra que la TMB para la persona es de aproximadamente 1351.50 kcal/día
